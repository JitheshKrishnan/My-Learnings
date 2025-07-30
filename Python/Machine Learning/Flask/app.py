from flask import Flask, render_template, request, jsonify
import pickle
import base64
import numpy as np
from PIL import Image
from io import BytesIO
import os
import joblib

app = Flask(__name__)

# Provide the absolute path to the pickle file
pickle_file_path = r"C:\Users\Jithu\AI-One Credit Course\Brain Disorder - ML\Project\Final-KNN.joblib"

# Check if the file exists
if not os.path.isfile(pickle_file_path):
    print("Error: File 'Final-KNN.joblib' not found.")
    exit()

# Load the pickled model
with open(pickle_file_path, 'rb') as model_file:
    model = joblib.load(model_file)

def preprocess_image(base64_image):
    # Decode base64 and convert to a NumPy array
    img_data = base64.b64decode(base64_image)
    img = Image.open(BytesIO(img_data))
    
    # Preprocess the image (modify this according to your model requirements)
    # Example: resize to (224, 224) for a hypothetical image classification model
    img = img.resize((224, 224))
    img_array = np.array(img)
    
    # Return the preprocessed image array
    return img_array

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    try:
        # Get the uploaded image from the request
        image_file = request.files['image']

        # Preprocess the image
        img = Image.open(image_file)
        img = img.resize((224, 224))  # Adjust size as needed
        img_array = np.array(img)

        # Make prediction using the loaded model
        prediction = model.predict(img_array.reshape(1, -1))

        # Return the prediction as JSON
        return jsonify({'prediction': str(prediction[0])})

    except Exception as e:
        print("Error during prediction:", str(e))
        return jsonify({'error': 'Error during prediction'})


if __name__ == '__main__':
    app.run(debug=True)
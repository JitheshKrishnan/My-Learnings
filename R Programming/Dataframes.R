# Dataframes
#creating a dataframe
vec1 = c(1, 2, 3)
vec2 = c("R", "Scilab", "Java")
vec3 = c("For prototyping", "For prototyping", "For scaleup")
df = data.frame(vec1, vec2, vec3)
print(df)

# creating dataframe using data from a file
df1 = read.table(file = "C:/Users/Radhakrishnan P/Downloads/abc.csv", sep = ",", header = TRUE)
print(df1)

#accessin the rows and columns in a dataframe
#accessind first and second rows
print(df[1:2,])
#accessing first and second columns
print(df[,1:2])
#accessing first and second column - alternate
print(df[1:2])

#subset
pd = data.frame("Name" = c("Senthil", "Senthil", "Same", "Sam"), "Month" = c("Jan", "Jan", "Feb", "Feb"), "BS" = c(141.2, 139.3, 135.2, 160.1), "BP" = c(90, 78, 80, 81))
pd2 = subset(pd,Name == "Senthil"| BS > 150)
print("new subset pd2")
print(pd2)
print(pd)

#edit dataframes
df[[2]][2] = "R"
print(df)

myTable = data.frame()
myTable = edit(myTable)

#adding extra rows and columns
df = rbind(df, data.frame(vec1 = 4, vec2 = "C", vec3 = "For scaleup"))
print("adding extra row")
print(df)
df = cbind(df, vec4 = c(10, 20, 30, 40))
print("adding extra column")
print(df)

#delete rows and columns
df2 = df[-3,-1]
print(df2)
#conditional deletion
df3 = df[,!names(df)%in%c(vec3)]
print(df3)
df4 = df[!df$vec1 == 3,]
print(df4)

#manupulate rows in dataframe - the factor issue
df[3, 1] = 3.1
df[3, 3] = "Others"
print(df)

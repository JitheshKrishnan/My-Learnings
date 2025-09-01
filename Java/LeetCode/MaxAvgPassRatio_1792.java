// ! Topic: Greedy

// ? Medium Difficulty

// * My Solution: Time Limit Exceeded

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int index = 0;
        double result = 0;
        for(int i = 0; i < extraStudents; i++){
            double max = 0;
            for(int j = 0; j < classes.length; j++){
                double diff = (double)(classes[j][0]+1)/(classes[j][1]+1) - (double)classes[j][0]/classes[j][1];
                if(diff > max){
                    index = j;
                    max = diff;
                }
            }
            classes[index][0]++;
            classes[index][1]++;
        }
        for(int i = 0; i < classes.length; i++)
            result += (double)classes[i][0]/(double)classes[i][1];
        return result/classes.length;
    }
}

public class MaxAvgPassRatio_1792{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] classes = {{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        System.out.println(sol.maxAverageRatio(classes, extraStudents));
    }
}

// * Better Accepted Solution


// class Solution {
//     public double maxAverageRatio(int[][] classes, int extraStudents) {
//         PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
//             public int compare(double[] a, double[] b) {
//                 if (a[0] < b[0]) return 1;
//                 if (a[0] > b[0]) return -1;
//                 return 0;
//             }
//         });

//         for (int i = 0; i < classes.length; i++) {
//             double pass = classes[i][0];
//             double total = classes[i][1];
//             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
//             pq.offer(new double[]{inc, pass, total});
//         }

//         while (extraStudents > 0) {
//             double[] top = pq.poll();
//             double pass = top[1] + 1;
//             double total = top[2] + 1;
//             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
//             pq.offer(new double[]{inc, pass, total});
//             extraStudents--;
//         }

//         double sum = 0.0;
//         Object[] arr = pq.toArray();
//         for (int i = 0; i < arr.length; i++) {
//             double[] c = (double[]) arr[i];
//             sum += c[1] / c[2];
//         }

//         return sum / classes.length;
//     }
// }
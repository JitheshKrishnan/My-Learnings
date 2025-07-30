    package Collections;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;

    class Student implements Comparable<Student>{
        int age;
        String name;

        public Student(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString(){
            return "Student [age=" + age + ", name=" + name + "]";
        }

        public int compareTo(Student that){
            return this.age > that.age? 1 : -1;
        }
    }
    public class Comparator_vs_comparable {
        public static void main(String a[]){
            Comparator<Integer> com = new Comparator<Integer>(){
                public int compare(Integer i, Integer j){
                    if(i%10 > j%10)
                        return 1;
                    else
                        return -1;
                }
            };
            
            
            List<Integer> nums = new ArrayList<>();
            nums.add(28);
            nums.add(45);
            nums.add(51);
            nums.add(92);

            Collections.sort(nums, com); 
            System.out.println(nums);

            Comparator<Student> com1 = (i, j) -> i.age>j.age?1:-1;
            List<Student> stds = new ArrayList<>();
            stds.add(new Student(56, "jk"));
            stds.add(new Student(51, "nk"));
            stds.add(new Student(24, "vc"));
            stds.add(new Student(39, "am"));

            Collections.sort(stds, com1);  // Using Comparator
            // Collections.sort(stds) // Using Comparable
            for(Student s : stds){
                System.out.println(s);
            }
        }
    }

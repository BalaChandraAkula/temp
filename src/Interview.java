public class Interview {
    public static void main(String[] args) {
        String st = "a**hf*kl9";
        print(st);
    }
    public static void print(String str){
        int n = str.length();
        //StringBuilder ans = new StringBuilder();
        String ans = "";
//        String characters = "";

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='*'){
                ans ="*"+ans;
            }else{
                ans+=ch;
            }
        }
        System.out.print(ans);
    }
}

//    Write a query to find the names of employees that begin with ‘S’
//select employees from employee where employees like 'S%'
//
//
//        Write a query to fetch details of employees whose EmpLname ends with an alphabet ‘A’ and contains five alphabets
//select * from employees where EmpLname like '____A';
//
//
//        introduction
//        Given a string like a*hf*kl9, write a function that returns a string with all asterisks appearing first.
//        output: **ahfkl9
//        Write a query to find the names of employees that begin with ‘S’
//        Write a query to fetch details of employees whose EmpLname ends with an alphabet ‘A’ and contains five alphabets
//
//        theory Quetions :
//        joins
//        access modifiers
//        exception handling













/*
Description


Write a code that prints the numbers between 2,000 and 3,000 i.e (2000<=number<3000), which are divisible by 8 but not by 6. (Hint: apply Boolean condition - number%8==0 && number%6!=0)

Note:

1) Please print all the even numbers on the same line, such as:

2000 2008 2024 ...

and not on different lines, such as:

2000

2008

2024

...

2) Please include number 2000<=number<3000.
*/
class Source{
    public static void main(String[] args){
        int j=3000;
        for(int number=2000;number<=j;number++){
            if(number%8==0 && number%6!=0){
                System.out.print(number+" ");
            }
        }
    }
}

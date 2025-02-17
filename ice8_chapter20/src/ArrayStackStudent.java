public class ArrayStackStudent {
   private String[] student;
   private int[] studentID;
   private int[] studentAge;
   private int top;

   public ArrayStackStudent(int number) {
       student = new String[number];
       studentID = new int[number];
       studentAge = new int[number];
       top = 0;
   }

   public boolean isEmpty() {
       return top == 0;
   }

   public void push(String s) {
       if (top == student.length) {
           throw new StackOverFlowException();
       }
       else {
           student[top] = s;
           top++;
       }
   }

   public String pop() {
       if (isEmpty()) {
           throw new EmptyStackException();
       }
       else {
           top--;
           return student[top];
       }
   }

   public String peek() {
       if (isEmpty()) {
           throw new EmptyStackException();
       }
       else {
           return student[top-1];
       }
   }
}

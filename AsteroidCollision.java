import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids){
        int len = asteroids.length;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < len ; i++){
          int curr = asteroids[i];
          
          while(true){
            if(stack.isEmpty() || stack.peek() > 0 && curr > 0 || stack.peek() < 0 && curr < 0 || stack.peek() < 0 && curr > 0){
            stack.push(curr);
            break;
            }
            else{
              if(stack.peek() == Math.abs(curr)){
                stack.pop();
                break;
              }
              else if(stack.peek() > Math.abs(curr)){
                break;
              }
              else{
                stack.pop();
              }
            }
          }
        }

        int stackSize = stack.size();
        asteroids = new int[stackSize];
        for(int i = stackSize - 1 ; i >= 0 ; i--){
            asteroids[i] = stack.pop();
        }
        return asteroids;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

        asteroids = new int[]{8, -8};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

        asteroids = new int[]{10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

        asteroids = new int[]{3, 5, -6, 2, -1, 4};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    
}

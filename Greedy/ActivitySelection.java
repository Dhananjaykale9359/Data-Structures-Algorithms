import java.util.*;
import java.util.Comparator;

public class ActivitySelection {

  public static void main(String args[]) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };

    int maxAct = 1;
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(0);
    int lasttime = end[0];
    for (int i = 1; i < end.length; i++) {
      if (start[i] >= lasttime) {
        maxAct++;
        ans.add(i);
        lasttime = end[i];
      }
    }
    System.out.println("Max Activities are =" + maxAct);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");
    }
    System.out.println();
  }
}
// Case 2 : If Array are not Sorted
// public class ActivitySelection {
//   public static void main(String args[]) {
//     int start[] = { 0, 1, 3, 5, 5, 8 };
//     int end[] = { 6, 2, 4, 7, 9, 9 };
//     ArrayList<Integer> ans = new ArrayList<>();
//     int activities[][] = new int[start.length][3];
//     for (int i = 0; i < start.length; i++) {
//       activities[i][0] = i;
//       activities[i][1] = start[i];
//       activities[i][2] = end[i];
//     }
//     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//     int maxAct = 1;
//     ans.add(activities[0][0]);
//     int lastEnd = activities[0][2];
//     for (int i = 1; i < start.length; i++) {
//       if (activities[i][1] >= lastEnd) {
//         maxAct++;
//         ans.add(activities[i][0]);
//         lastEnd = activities[i][2];
//       }
//     }
//     System.out.println("Maximum Activities Count are =" + maxAct);
//     for (int i = 0; i < ans.size(); i++) {
//       System.out.print("A" + ans.get(i) + " ");
//     }
//     System.out.println();
//   }
// }

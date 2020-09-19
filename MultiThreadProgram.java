class JobThread extends Thread {
  Job job;
  public JobThread(int n) {
    job = new Job(n);
  }
  @Override
  public void run() {
    while (true) {
      job.work();
    }
  }
}
public class MultiThreadProgram {
  public MultiThreadProgram(int jobcount) {
    for (int i = 0; i < jobcount; i++) {
      new JobThread(i).start();
    }
  }
  public static void main(String[] args) {
    new MultiThreadProgram(10);
  }
}
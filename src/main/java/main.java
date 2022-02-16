import Entity.TestTable;
import Repository.TestTableRepository;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        TestTableRepository testTableRepository = new TestTableRepository();
        Random random = new Random();
        ExecutorService e = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 20; i++) {
            int finalI = i;
            e.submit(new Runnable() {
                @Override
                public void run() {
                    TestTable testTable = new TestTable(random.nextInt(100));
                    testTableRepository.save(testTable);
                    System.out.println("just added record number " + finalI +
                            " By Thread" + Thread.currentThread().getName());
                }
            });
        }
        e.shutdown();

    }
}

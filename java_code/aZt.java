/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.WorkerTestCommand;

public class aZt
implements Runnable {
    private long b = System.currentTimeMillis();
    final /* synthetic */ WorkerTestCommand a;

    public aZt(WorkerTestCommand workerTestCommand) {
        this.a = workerTestCommand;
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        System.err.println("Delta time : " + (l - this.b));
        if (l - this.b < 1000L) {
            boolean bl = false;
        }
        this.b = l;
    }
}


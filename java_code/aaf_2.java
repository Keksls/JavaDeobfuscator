/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from aAf
 */
class aaf_2
extends OutputStream {
    final Queue<String> a = new ConcurrentLinkedQueue<String>();
    StringBuffer b = new StringBuffer();

    aaf_2() {
    }

    @Override
    public void write(int n) {
        char c2 = (char)n;
        if (c2 == '\n') {
            String string = this.b.toString();
            this.a.offer(string);
            this.b = new StringBuffer();
        } else {
            this.b.append(c2);
        }
    }

    public String a() {
        return this.a.poll();
    }
}


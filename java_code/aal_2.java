/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.PrintStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aAl
 */
public class aal_2 {
    protected static final Logger a = Logger.getLogger(aal_2.class);
    final aaf_2 b = new aaf_2();
    final ArrayList<aak_2> c = new ArrayList();
    final int d;
    final int e;

    public aal_2(int n, int n2) {
        this.d = n;
        this.e = n2;
    }

    public void a(aak_2 aak_22) {
        this.c.add(aak_22);
    }

    public void a() {
        aai_2 aai_22 = new aai_2();
        new Thread((Runnable)new aam_2(this, aai_22), "GLDebugCaptureThread").start();
        new Thread((Runnable)new aan_1(this, aai_22), "GLDebugStatsUpdate").start();
    }

    public PrintStream b() {
        return new PrintStream(this.b);
    }
}


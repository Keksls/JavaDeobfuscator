/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Cursor;
import org.apache.log4j.Logger;

/*
 * Renamed from fJC
 */
public class fjc_2
implements fje_2,
Runnable {
    private static Logger b = Logger.getLogger(fjc_2.class);
    private Cursor[] c;
    private int d;
    private int e;

    public fjc_2(Cursor[] cursorArray, int n) {
        assert (n > 0) : "delay <= 0 !";
        assert (cursorArray != null && cursorArray.length > 0) : "Invalid cursor array !";
        this.c = cursorArray;
        this.d = n;
        this.e = 0;
    }

    public long a() {
        return 1L;
    }

    public void a(long l) {
    }

    @Override
    public void b() {
        this.e = 0;
        this.run();
        ado_1.a().a(this, this.d, -1);
    }

    @Override
    public void c() {
        ado_1.a().b(this);
    }

    @Override
    public void run() {
        fpm_0.b().i().a(this.c[this.e]);
        this.e = (this.e + 1) % this.c.length;
    }
}


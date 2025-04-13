/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from bLW
 */
public class blw_0 {
    protected static final Logger a = Logger.getLogger(blw_0.class);
    private final LinkedList<ddC> b = new LinkedList();
    ddC c;

    public void a(ddC ddC2) {
        String string = ddC2.c();
        boolean bl = ddC2.a();
        long l = ddC2.b();
        if (!bl && !((bvx_0)ans_0.D().h()).a(bWe.Z)) {
            return;
        }
        if (this.c == null || !this.c.a() && bl) {
            this.c = ddC2;
            fis_1.a().a("petBubbleMessage", (Object)string);
            if (l != -1L) {
                long l2 = l > 0L ? l : (long)(zh_0.a(string) / 2);
                ado_1.a().a(new blx_0(this, ddC2), l2, 1);
            }
            aUh.b("gelutin", string);
        } else {
            this.b.addLast(ddC2);
        }
    }

    public void a() {
        this.c = null;
        if (!this.b.isEmpty()) {
            this.a(this.b.poll());
        } else {
            ddB.a().c();
        }
    }

    public void b() {
        this.c = null;
        this.b.clear();
        ddB.a().c();
    }
}


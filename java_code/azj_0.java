/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.ssl.SslContext
 *  org.apache.log4j.Logger
 */
import io.netty.handler.ssl.SslContext;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Supplier;
import javax.net.ssl.SSLException;
import org.apache.log4j.Logger;

/*
 * Renamed from aZJ
 */
class azj_0 {
    static final Logger a = Logger.getLogger(azj_0.class);
    private final Queue<QP> b = new LinkedList<QP>();
    private Runnable c;

    azj_0() {
    }

    void a() {
        this.b.clear();
        this.c = null;
    }

    void a(List<QP> list) {
        this.b.addAll(list);
    }

    void a(Runnable runnable) {
        this.c = runnable;
    }

    void b() {
        boolean bl = false;
        while (!bl && !this.b.isEmpty()) {
            QP qP = this.b.poll();
            bl = azj_0.a(qP.a(), qP.b(), true);
        }
        if (!bl && this.c != null) {
            this.c.run();
        }
    }

    static boolean a(String string, int n, boolean bl) {
        try {
            a.info((Object)("Connexion au proxy :" + string + ":" + n + " / ssl : " + bl));
            SslContext sslContext = bl ? afo_1.b() : null;
            Supplier<agm_2> supplier = () -> new azk_0(string, n);
            afr_1 afr_12 = new afr_1(agf_2.a, supplier, sslContext);
            afr_12.a(cew_0.b);
            aft_1 aft_12 = new aft_1(afr_12, string, n);
            return aft_12.a(true, false);
        }
        catch (InterruptedException | SSLException exception) {
            a.warn((Object)("Unable to connect to " + string + ":" + n), (Throwable)exception);
            return false;
        }
    }
}


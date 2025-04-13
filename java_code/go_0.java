/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.log4j.Logger;

/*
 * Renamed from GO
 */
public class go_0 {
    static final Logger a = Logger.getLogger(go_0.class);
    private static final go_0 b = new go_0();
    private final ExecutorService c = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setNameFormat("AsyncLoader-%d").build());

    private go_0() {
    }

    public static go_0 a() {
        return b;
    }

    public final gq_0 a(URL uRL) {
        gq_0 gq_02 = new gq_0(uRL);
        this.a(gq_02);
        return gq_02;
    }

    public final void a(gn_0 gn_02) {
        this.c.execute(new gp_0(gn_02));
    }

    public String toString() {
        return "AsyncLoader{m_service=" + this.c + "}";
    }
}


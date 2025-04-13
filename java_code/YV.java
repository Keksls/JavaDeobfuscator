/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class YV
implements YW {
    private static final Logger b = Logger.getLogger(YV.class);
    private aew_0 c;
    private acs_0 d;
    private aev e;
    private String f;
    private String g;
    private final Ya h = new Ya();
    private final Ya i = new Ya();
    private static final YV j = new YV();

    public static YV a() {
        return j;
    }

    private YV() {
    }

    @Override
    public void a(aew_0 aew_02, acs_0 acs_02, aev aev2) {
        this.c = aew_02;
        this.d = acs_02;
        this.e = aev2;
    }

    @Override
    public boolean a(short s2, short s3) {
        return this.h.a((int)s2, (int)s3);
    }

    @Override
    public void b(short s2, short s3) {
        yz_0.a(s2, s3);
        this.e.c(s2, s3);
        try {
            this.c.a(s2, s3);
        }
        catch (IOException iOException) {
            b.warn((Object)("Environnement map doesn't exists " + s2 + " " + s3), (Throwable)iOException);
        }
    }

    @Override
    public void a(long l) {
        assert (this.f != null) : "D'abord appler setValidMapsCoordFile";
        this.h.a(this.f, l);
        this.i.a(this.g, l);
        this.d.a(new acm_0(), this.i);
        YY.a().a(l);
    }

    @Override
    public void b() {
        this.h.a();
        this.i.a();
    }

    public Ya a(int n) {
        Ya ya = new Ya();
        ya.a(this.g, (long)n);
        return ya;
    }

    public void a(@NotNull String string, @NotNull String string2) {
        this.f = string;
        this.g = string2;
        this.d.a(this.i);
    }

    @Override
    public void b(long l) {
        aes_0.a().a(l);
        aes_0.a().c();
    }
}


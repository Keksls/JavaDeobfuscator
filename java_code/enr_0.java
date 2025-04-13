/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eNr
 */
public class enr_0 {
    static final Logger a = Logger.getLogger(enr_0.class);
    private enq_0 b = enq_0.b;
    private byte c;
    private final byte d;
    private final boolean e;
    private final long f;
    private boolean g;
    private Long h;

    enr_0(byte by, boolean bl, boolean bl2, long l) {
        this.e = bl2;
        this.d = by;
        this.c = by;
        this.g = bl;
        this.f = l;
        this.h = l;
    }

    public boolean a() {
        return this.b == enq_0.b;
    }

    public boolean b() {
        return this.b == enq_0.c;
    }

    public boolean c() {
        return this.b == enq_0.d;
    }

    public enq_0 d() {
        return this.b;
    }

    public byte e() {
        return this.c;
    }

    public void a(byte by) {
        this.c = by;
    }

    public byte f() {
        return this.d;
    }

    boolean a(enq_0 enq_02) {
        if (this.b != enq_02.a()) {
            a.error((Object)String.format("[FIGHT_STATE] \u00c9tat incorrect pour une transition vers l'\u00e9tat %s, actuel: %s, requis: %s", new Object[]{enq_02, this.b, enq_02.a()}), (Throwable)new Exception("for stacktrace"));
            return false;
        }
        this.b = enq_02;
        return true;
    }

    void b(enq_0 enq_02) {
        this.b = enq_02;
    }

    public boolean g() {
        return this.e;
    }

    public boolean h() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public long i() {
        return this.f;
    }

    public Long j() {
        return this.h;
    }

    public void a(Long l, byte by) {
        this.h = l;
        this.c = by;
    }

    public boolean a(long l) {
        return this.h != null && this.h == l;
    }

    public boolean b(long l) {
        return this.f == l;
    }
}


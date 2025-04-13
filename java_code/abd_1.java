/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from aBd
 */
public class abd_1
implements abg_1,
adv_1 {
    private static final long a = 60000L;
    private final AtomicInteger b = new AtomicInteger();
    private int c = -1;
    private long d;
    private static final abd_1 e = new abd_1();

    public static abd_1 a() {
        return e;
    }

    private abd_1() {
    }

    public static void a(int n) {
        if (n < 0 || n > 255) {
            throw new IllegalArgumentException("Le num\u00e9ro de serveur doit \u00eatre compris entre 0 et 255");
        }
        abd_1.e.c = n;
        abd_1.e.b.set(0);
        e.e();
        adi_2.a().a(e, 60000L, 0);
    }

    public static long c() {
        return abd_1.e.d + ((long)abd_1.e.b.incrementAndGet() & 0xFFFFFFL);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12.a() == Integer.MIN_VALUE) {
            this.e();
            this.b.set(0);
            return false;
        }
        return true;
    }

    private void e() {
        if (this.c < 0 || this.c > 255) {
            throw new IllegalArgumentException("Impossible d'initialiser le GUIDGenerator : Le num\u00e9ro de serveur doit \u00eatre fix\u00e9 par la m\u00e9thode init");
        }
        this.d = ((long)this.c & 0xFFL) << 48;
        this.d |= (System.currentTimeMillis() / 60000L & 0xFFFFFFL) << 24;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public long d() {
        return abd_1.c();
    }
}


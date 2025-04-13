/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from asM
 */
public class asm_1 {
    private final Ow a;
    private final Date b;
    private final TreeSet<asv_1> c;
    private final AtomicInteger d;

    asm_1(@NotNull Ow ow, @Nullable Date date) {
        this.a = ow;
        this.b = new Date(date.getTime());
        this.c = new TreeSet<asv_1>(asn_1.a);
        this.d = new AtomicInteger(0);
    }

    @NotNull
    public Ow a() {
        return this.a;
    }

    @Nullable
    public Date b() {
        return this.b;
    }

    public int c() {
        return this.d.get();
    }

    public Collection<asv_1> d() {
        return this.c;
    }

    void a(asv_1 asv_12) {
        this.c.add(asv_12);
    }

    void a(int n) {
        this.d.set(n);
    }

    int e() {
        return this.d.decrementAndGet();
    }

    public String toString() {
        return "{NewsChannel lang=" + this.a.b() + " pubDate=" + this.b + " items count=" + this.c.size() + "}";
    }
}


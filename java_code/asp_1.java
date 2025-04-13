/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from asP
 */
public abstract class asp_1 {
    protected final afk_2 a;
    private final ass_1 b;
    private asq_1 c;
    private asq_1 d;
    private asr_1 e;

    asp_1(@NotNull ass_1 ass_12, @NotNull afk_2 afk_22) {
        this.b = ass_12;
        this.a = afk_22;
    }

    public afk_2 a() {
        return new afk_2(this.a);
    }

    public ass_1 b() {
        return this.b;
    }

    public asq_1 c() {
        return this.c;
    }

    public asq_1 d() {
        return this.d;
    }

    @Nullable
    public asr_1 e() {
        return this.e;
    }

    void a(asr_1 asr_12) {
        this.e = asr_12;
    }

    void a(asq_1 asq_12) {
        this.c = asq_12;
    }

    void b(asq_1 asq_12) {
        this.d = asq_12;
    }
}


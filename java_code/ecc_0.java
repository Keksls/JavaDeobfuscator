/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eCc
 */
public class ecc_0
implements ece_0 {
    private static final Logger b = Logger.getLogger(ecc_0.class);
    public static final ecc_0 a = new ecc_0();

    protected ecc_0() {
    }

    @Override
    @NotNull
    public ebw_0 a(@NotNull ect_0 ect_02) {
        b.warn((Object)String.format("[CRAFT] Learn craft (%s) inside default craft handler was called, craft handler is probably missing !", ect_02), (Throwable)new IllegalStateException());
        return ebw_0.e;
    }

    @Override
    @NotNull
    public ebw_0 c(@NotNull ect_0 ect_02) {
        b.warn((Object)String.format("[CRAFT] Unlearn craft (%s) inside default craft handler was called, craft handler is probably missing !", ect_02), (Throwable)new IllegalStateException());
        return ebw_0.e;
    }

    @Override
    @NotNull
    public ebw_0 a(int n, int n2) {
        b.warn((Object)String.format("[CRAFT] Learn recipe (craftId : %s, recipeId : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return ebw_0.e;
    }

    @Override
    @NotNull
    public Set<Integer> a(int n) {
        b.warn((Object)String.format("[CRAFT] Getting recipes known (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return Collections.emptySet();
    }

    @Override
    public long a(int n, long l) {
        b.warn((Object)String.format("[CRAFT] Adding xp (craftId : %s, xp : %s) inside default craft handler was called, craft handler is probably missing !", n, l), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public void b(int n) {
        b.warn((Object)String.format("[CRAFT] Trigger sucess of plantation (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
    }

    @Override
    public void a(int n, boolean bl) {
        b.warn((Object)String.format("[CRAFT] Trigger sucess of collect (craftId : %s, isGrossProduct : %s) inside default craft handler was called, craft handler is probably missing !", n, bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void c(int n) {
        b.warn((Object)String.format("[CRAFT] Trigger sucess of recipe (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
    }

    @Override
    public void d(int n) {
        b.warn((Object)String.format("[CRAFT] Notify sucess of recipe (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
    }

    @Override
    public boolean e(int n) {
        b.warn((Object)String.format("[CRAFT] Check if contains (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public short f(int n) {
        b.warn((Object)String.format("[CRAFT] Getting level (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public double c(int n, long l) {
        b.warn((Object)String.format("[CRAFT] Getting percent level for xp (craftId : %s, xp : %s) inside default craft handler was called, craft handler is probably missing !", n, l), (Throwable)new IllegalStateException());
        return 0.0;
    }

    @Override
    public double g(int n) {
        b.warn((Object)String.format("[CRAFT] Getting current percent level (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0.0;
    }

    @Override
    public long h(int n) {
        b.warn((Object)String.format("[CRAFT] Getting next in xp (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public long i(int n) {
        b.warn((Object)String.format("[CRAFT] Getting xp (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public int j(int n) {
        b.warn((Object)String.format("[CRAFT] Getting seed counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int k(int n) {
        b.warn((Object)String.format("[CRAFT] Getting gross resrouce collect counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int l(int n) {
        b.warn((Object)String.format("[CRAFT] Getting end resource collect counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int m(int n) {
        b.warn((Object)String.format("[CRAFT] Getting recipe counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public short n(int n) {
        b.warn((Object)String.format("[CRAFT] Getting min level of craft service (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public boolean o(int n) {
        b.warn((Object)String.format("[CRAFT] Getting if craft service is enabled (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean a() {
        b.warn((Object)"[CRAFT] Getting if craft service is enabled inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void a(boolean bl) {
        b.warn((Object)String.format("[CRAFT] Set craft service enabled (%s) inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void b(int n, boolean bl) {
        b.warn((Object)String.format("[CRAFT] Set craft service enabled (craftId : %s, enabled : %s) inside default craft handler was called, craft handler is probably missing !", n, bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void c(int n, int n2) {
        b.warn((Object)String.format("[CRAFT] Set craft service min level (craftId : %s, minLevel : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
    }

    @Override
    public @Unmodifiable @NotNull Set<Integer> b() {
        b.warn((Object)"[CRAFT] Getting known crafts inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptySet();
    }

    @Override
    public boolean d(int n, int n2) {
        b.warn((Object)String.format("[CRAFT] Getting if recipe is known (craftId : %s, recipeId : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public @Unmodifiable @NotNull Map<ebx_0, ebz_0> c() {
        b.warn((Object)"[CRAFT] Getting step fees inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptyMap();
    }

    @Override
    public boolean a(ebx_0 ebx_02, @Nullable ebz_0 ebz_02) {
        b.warn((Object)String.format("[CRAFT] Set step fee (step : %s, craftSteepFees : %s) inside default craft handler was called, craft handler is probably missing !", new Object[]{ebx_02, ebz_02}), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void a(Map<ebx_0, ebz_0> map) {
        b.warn((Object)String.format("Set steps fees (stepFees : %s) inside default craft handler was called, craft handler is probably missing !", map), (Throwable)new IllegalStateException());
    }

    @Override
    public @Unmodifiable @NotNull Map<Integer, Integer> d() {
        b.warn((Object)"[CRAFT] Getting overridden fees inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptyMap();
    }

    @Override
    public boolean a(int n, @Nullable Integer n2) {
        b.warn((Object)String.format("[CRAFT] Set overridden fee (recipeId : %s, fee : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void b(@NotNull Map<Integer, Integer> map) {
        b.warn((Object)String.format("[CRAFT] Set overridden fees (overriddenFees : %s) inside default craft handler was called, craft handler is probably missing !", map), (Throwable)new IllegalStateException());
    }

    @Override
    public boolean e() {
        b.warn((Object)"[CRAFT] Getting value of fee for guild member inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean b(boolean bl) {
        b.warn((Object)String.format("[CRAFT] Setting value of fee (hasFeeForGuild : %s) for guild member inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean f() {
        b.warn((Object)"Getting value of steps fallthrough inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean c(boolean bl) {
        b.warn((Object)String.format("Setting value of steps fallthrough (stepsFallthrough : %s) inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public int a(@NotNull eco_0 eco_02, boolean bl) {
        b.warn((Object)String.format("Getting value of fee for specific recipe (recipe : %s, hasSameGuild : %s) inside default craft handler was called, craft handler is probably missing !", eco_02, bl), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public void a(@NotNull ebv_0 ebv_02) {
        b.warn((Object)String.format("[CRAFT] Add following listener (%s) inside default craft handler was called, craft handler is probably missing !", ebv_02), (Throwable)new IllegalStateException());
    }

    @Override
    public void b(@NotNull ebv_0 ebv_02) {
        b.warn((Object)String.format("[CRAFT] Remove following listener (%s) inside default craft handler was called, craft handler is probably missing !", ebv_02), (Throwable)new IllegalStateException());
    }

    @Override
    public void a(@NotNull dc_1 dc_12, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    public void a(@NotNull gj_2 gj_22, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    public void a(@NotNull dw_1 dw_12, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    @NotNull
    public dc_1 g() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public di_1 h() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public fz_2 i() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public gj_2 j() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public dw_1 k() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public Map<Integer, Short> l() {
        return Collections.emptyMap();
    }

    @NotNull
    public static ebq_0 b(@NotNull ect_0 ect_02) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler isn't redacted to allow created craft");
    }
}


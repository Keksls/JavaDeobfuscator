/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpb
 */
public class bpb_1
extends epj_2<brw_1> {
    public static final bpb_1 a = new bpb_1(-2, 0, false, 0, 0, new EnumMap<eps_0, abo_2<Integer, Float>>(eps_0.class), 0, 0, new int[0], new int[0], new int[0], 0, new short[0], 0, 0, 0, 0, 30000, UL.b, UL.a, 5, 0, fjQ.a, 1.0f);
    private static final Logger d = Logger.getLogger(bpb_1.class);
    private final boolean e;
    private final int f;
    private final int g;
    private final byte h;
    private final TByteIntHashMap i;
    private final ArrayList<abi_2<bph_0>> j = new ArrayList();
    private final epz_1 k;
    private final float l;
    private bpg_1 m;
    private final ArrayList<bpp_1> n = new ArrayList();
    private String o;

    public bpb_1(short s2, int n, boolean bl, short s3, short s4, EnumMap<eps_0, abo_2<Integer, Float>> enumMap, int n2, int n3, int[] nArray, int[] nArray2, int[] nArray3, int n4, short[] sArray, short s5, short s6, byte by, byte by2, int n5, UL uL, UL uL2, int n6, int n7, fjQ fjQ2, float f2) {
        super(s2, n, s3, s4, enumMap, nArray2, nArray, sArray, s5, s6, by, n5, uL, uL2, n6, n7, fjQ2);
        this.f = n2;
        this.g = n3;
        if (!biG.c(this.f) && nArray3 != null && nArray3.length != 0) {
            if (nArray3.length % 2 != 0) {
                d.error((Object)" le tableau d'\u00e9quippement doit contenir des paires Id / Nombre");
            }
            this.i = new TByteIntHashMap(nArray3.length / 2);
            for (int k = 0; k < nArray3.length; k += 2) {
                this.i.put((byte)nArray3[k + 2], nArray3[k]);
            }
        } else {
            this.i = null;
            if (biG.c(this.f) && nArray3 != null && nArray3.length != 0) {
                d.error((Object)("ON TENTE DE METTRE DES EQUIPEMENTS (VISUEL) SUR UN GFX DE TYPE MONSTER (>1000), monsterId=" + s2));
            }
        }
        this.h = (byte)n4;
        this.e = bl;
        this.k = epz_1.a(by2);
        this.l = f2;
    }

    public boolean a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    @Override
    public byte d() {
        return this.h;
    }

    @Nullable
    public TByteIntHashMap e() {
        return this.i;
    }

    public String f() {
        short s2 = this.s();
        if (s2 == a.s()) {
            return "";
        }
        if (!bae.h().a(7, (long)s2)) {
            return "";
        }
        return bae.h().a(7, (long)s2, new Object[0]);
    }

    public ArrayList<abi_2<bph_0>> g() {
        return this.j;
    }

    public boolean a(int n) {
        return !this.j.isEmpty();
    }

    public void a(int n, int n2) {
        bph_0 bph_02 = bpp_0.a().a(n);
        if (bph_02 != null) {
            this.j.add(new abi_2<bph_0>(n2, bph_02));
        }
    }

    @Override
    public void a(bpp_1 bpp_12) {
        this.n.add(bpp_12);
    }

    public ArrayList<bpp_1> h() {
        return this.n;
    }

    @Nullable
    public bpp_1 a(long l) {
        for (int k = 0; k < this.n.size(); ++k) {
            bpp_1 bpp_12 = this.n.get(k);
            if (bpp_12.e() != l) continue;
            return bpp_12;
        }
        return null;
    }

    public epz_1 i() {
        return this.k;
    }

    public bpg_1 j() {
        return this.m;
    }

    @Override
    public void a(bpg_1 bpg_12) {
        this.m = bpg_12;
    }

    public String k() {
        return this.o;
    }

    @Override
    public void a(@NotNull String string) {
        this.o = Objects.requireNonNull(string);
    }

    @Override
    public void b(int n) {
        super.b(n);
    }

    public float l() {
        return this.l;
    }
}


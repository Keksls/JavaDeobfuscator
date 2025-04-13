/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anH
 */
public class anh_1<Data>
implements anb_0 {
    public static final int b = 100;
    public static final float c = 1.0f;
    public static final float d = 1.0f;
    public static final int e = 1;
    public static final boolean f = true;
    private final boolean g;
    private final Data h;
    private final float i;
    private final int j;
    private final float k;
    private final float l;

    public anh_1(Data Data) {
        this(Data, 100.0f);
    }

    public anh_1(boolean bl, Data Data) {
        this(bl, Data, 100.0f);
    }

    public anh_1(Data Data, float f2) {
        this(Data, f2, 1);
    }

    public anh_1(boolean bl, Data Data, float f2) {
        this(bl, Data, f2, 1);
    }

    public anh_1(Data Data, float f2, int n) {
        this(Data, f2, n, 1.0f, 1.0f);
    }

    public anh_1(boolean bl, Data Data, float f2, int n) {
        this(bl, Data, f2, n, 1.0f, 1.0f);
    }

    public anh_1(Data Data, float f2, float f3, float f4) {
        this(Data, f2, 1, f3, f4);
    }

    public anh_1(boolean bl, Data Data, float f2, float f3, float f4) {
        this(bl, Data, f2, 1, f3, f4);
    }

    public anh_1(Data Data, float f2, int n, float f3, float f4) {
        this(true, Data, f2, n, f3, f4);
    }

    public anh_1(boolean bl, Data Data, float f2, int n, float f3, float f4) {
        this.g = bl;
        this.h = Data;
        this.i = f2;
        this.j = n;
        this.k = f3;
        this.l = f4;
    }

    public boolean g() {
        return this.g;
    }

    public Data h() {
        return this.h;
    }

    public float j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    @Override
    public float c() {
        return this.k;
    }

    @Override
    public float d() {
        return this.l;
    }
}


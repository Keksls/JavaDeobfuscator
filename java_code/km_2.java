/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Km
 */
public class km_2
implements ki_2 {
    private final lp_2 a;

    public km_2(lp_2 lp_22) {
        this.a = lp_22;
    }

    @Override
    public void a(DataInput dataInput) {
        this.a.a(dataInput.readUnsignedShort());
        this.a.a(dataInput.readFloat(), dataInput.readFloat());
        this.a.b(dataInput.readFloat(), dataInput.readFloat());
        this.a.c(dataInput.readFloat(), dataInput.readFloat());
        this.a.d(dataInput.readFloat(), dataInput.readFloat());
        this.a.e(dataInput.readFloat(), dataInput.readFloat());
        this.a.f(dataInput.readFloat(), dataInput.readFloat());
        this.a.a(dataInput.readBoolean());
        this.a.g(dataInput.readFloat(), dataInput.readFloat());
        this.a.h(dataInput.readFloat(), dataInput.readFloat());
        this.a.i(dataInput.readFloat(), dataInput.readFloat());
        this.a.k(dataInput.readFloat(), dataInput.readFloat());
        this.a.m(dataInput.readFloat(), dataInput.readFloat());
        this.a.o(dataInput.readFloat(), dataInput.readFloat());
        int n = dataInput.readUnsignedShort();
        this.a.a(dataInput.readFloat());
        this.a.b(dataInput.readFloat());
        this.a.c(dataInput.readFloat());
        this.a.d(dataInput.readFloat());
        this.a.c(dataInput.readInt());
        this.a.b(dataInput.readInt());
        this.a.j(dataInput.readFloat(), dataInput.readFloat());
        this.a.l(dataInput.readFloat(), dataInput.readFloat());
        this.a.n(dataInput.readFloat(), dataInput.readFloat());
        this.a.p(dataInput.readFloat(), dataInput.readFloat());
        this.a.q(dataInput.readFloat(), dataInput.readFloat());
        this.a.r(dataInput.readFloat(), dataInput.readFloat());
        this.a.s(dataInput.readFloat(), dataInput.readFloat());
    }
}


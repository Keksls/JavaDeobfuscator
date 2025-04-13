/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kn
 */
public class kn_2
implements ki_2 {
    private final lq_2 a;

    public kn_2(lq_2 lq_22) {
        this.a = lq_22;
    }

    @Override
    public void a(DataInput dataInput) {
        this.a.t(dataInput.readFloat(), dataInput.readFloat());
        this.a.a(dataInput.readInt(), dataInput.readInt());
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


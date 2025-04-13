/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from LL
 */
public class ll_1 {
    private final ki_1 a;

    public ll_1(ki_1 ki_12) {
        this.a = ki_12;
    }

    public void a(DataOutput dataOutput) {
        dataOutput.write((this.a.a() ? "EPS" : "eps").getBytes());
        dataOutput.writeInt((int)this.a.b());
    }
}


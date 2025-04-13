/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kf
 */
public class kf_1 {
    private final ki_1 a;

    public kf_1(ki_1 ki_12) {
        this.a = ki_12;
    }

    public void a(DataInput dataInput) {
        byte[] byArray = new byte[3];
        dataInput.readFully(byArray);
        String string = new String(byArray).intern();
        if ("eps".equals(string)) {
            this.a.a(false);
        } else if ("EPS".equals(string)) {
            this.a.a(true);
        } else {
            throw new IllegalStateException("Invalid signature " + string);
        }
        long l = (long)dataInput.readInt() & 0xFFFFFFFFL;
        this.a.a(l);
    }
}


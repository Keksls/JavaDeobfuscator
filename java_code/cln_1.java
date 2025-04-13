/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from clN
 */
public class cln_1
extends Pw {
    private final long a;
    private final long b;

    public cln_1(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] b() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray;
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeLong(this.a);
                dataOutputStream.writeLong(this.b);
                dataOutputStream.flush();
                byArray = this.a((byte)3, byteArrayOutputStream.toByteArray());
            }
            return byArray;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to write message for token " + this.a, iOException);
        }
    }

    @Override
    public int a() {
        return 12529;
    }
}


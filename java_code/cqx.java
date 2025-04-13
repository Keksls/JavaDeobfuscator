/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class cqx
extends Pw {
    private final String a;
    private final String b;
    private final long c;

    public cqx(String string, String string2, long l) {
        this.a = string;
        this.b = string2;
        this.c = l;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] b() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray;
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeUTF(this.a);
                dataOutputStream.writeUTF(this.b);
                dataOutputStream.writeLong(this.c);
                dataOutputStream.flush();
                byArray = this.a((byte)3, byteArrayOutputStream.toByteArray());
            }
            return byArray;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to write message", iOException);
        }
    }

    @Override
    public int a() {
        return 13845;
    }
}


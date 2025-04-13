/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from asn
 */
final class asn_2
extends DeflaterOutputStream {
    public asn_2(OutputStream outputStream, Deflater deflater, int n) {
        super(outputStream, deflater, n);
    }

    public asn_2(OutputStream outputStream, Deflater deflater) {
        super(outputStream, deflater);
    }

    public asn_2(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        this.out = outputStream;
        this.buf = new byte[512];
        this.def.reset();
    }
}


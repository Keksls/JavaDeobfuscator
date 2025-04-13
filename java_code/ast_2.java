/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from ast
 */
final class ast_2
extends InflaterInputStream {
    public ast_2(InputStream inputStream, Inflater inflater, int n) {
        super(inputStream, inflater, n);
    }

    public ast_2(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    public ast_2(InputStream inputStream) {
        super(inputStream);
    }

    public void a(InputStream inputStream) {
        this.in = inputStream;
        this.inf.reset();
    }
}


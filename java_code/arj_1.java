/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from arJ
 */
public class arj_1
extends InputStream {
    private final arf_1 a;

    public arj_1(arf_1 arf_12) {
        this.a = arf_12;
    }

    @Override
    public int read() {
        try {
            return this.a.a();
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            return -1;
        }
    }

    @Override
    public int read(@NotNull byte[] byArray, int n, int n2) {
        int n3 = this.a.a(byArray, n, n2);
        return n3 == 0 ? -1 : n3;
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public int available() {
        return this.a.g();
    }
}


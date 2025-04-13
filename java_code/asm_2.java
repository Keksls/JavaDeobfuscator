/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/*
 * Renamed from asm
 */
class asm_2
extends BufferedOutputStream {
    asm_2(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        this.out = outputStream;
        this.count = 0;
    }
}


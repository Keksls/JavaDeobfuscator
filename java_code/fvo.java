/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Memory
 *  uk.co.caprica.vlcj.player.direct.BufferFormat
 *  uk.co.caprica.vlcj.player.direct.DirectMediaPlayer
 *  uk.co.caprica.vlcj.player.direct.RenderCallback
 */
import com.sun.jna.Memory;
import java.nio.ByteBuffer;
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
import uk.co.caprica.vlcj.player.direct.RenderCallback;

public final class fvo
extends ayz_2
implements RenderCallback {
    private ByteBuffer b;
    private long c = -1L;
    private BufferFormat d;

    public fvo() {
        this.a();
    }

    @Override
    public byte b() {
        return 18;
    }

    @Override
    protected long e() {
        return this.c;
    }

    @Override
    protected ByteBuffer f() {
        return this.b;
    }

    @Override
    protected int c() {
        return this.d != null ? this.d.getWidth() : 0;
    }

    @Override
    protected int d() {
        return this.d != null ? this.d.getHeight() : 0;
    }

    public void display(DirectMediaPlayer directMediaPlayer, Memory[] memoryArray, BufferFormat bufferFormat) {
        this.c = this.c == -1L ? 1L : ++this.c;
        this.d = bufferFormat;
        Memory memory = memoryArray[0];
        int n = Math.toIntExact(memory.size());
        byte[] byArray = memory.getByteArray(0L, n);
        this.b = ByteBuffer.wrap(byArray);
    }
}


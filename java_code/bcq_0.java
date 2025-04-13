/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcq
 */
public class bcq_0 {
    private ChannelHandlerContext a;
    private bcs_0 b;

    @Nullable
    public ChannelFuture a() {
        if (this.b != null) {
            this.b.a();
        }
        if (this.a == null) {
            return null;
        }
        return this.a.close();
    }

    public boolean b() {
        if (this.a == null) {
            return false;
        }
        return this.a.channel().isActive();
    }

    public void a(@NotNull MessageLite messageLite) {
        if (this.a == null || !this.a.channel().isActive()) {
            return;
        }
        this.a.writeAndFlush((Object)messageLite);
    }

    public void c() {
        this.b.b();
    }

    public void d() {
        this.a = null;
        this.b = null;
    }

    public void a(ChannelHandlerContext channelHandlerContext) {
        this.a = channelHandlerContext;
    }

    public ChannelHandlerContext e() {
        return this.a;
    }

    void a(bcs_0 bcs_02) {
        this.b = bcs_02;
    }
}


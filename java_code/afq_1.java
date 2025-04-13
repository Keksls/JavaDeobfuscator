/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/*
 * Renamed from aFQ
 */
public class afq_1 {
    private final ChannelHandlerContext a;

    public afq_1(ChannelHandlerContext channelHandlerContext) {
        this.a = channelHandlerContext;
    }

    public ChannelFuture a() {
        return this.a.close();
    }

    public boolean b() {
        return this.a.channel().isActive();
    }

    public <OutputMessage extends adt_1> void a(OutputMessage OutputMessage) {
        byte[] byArray = ((adp_2)((Object)OutputMessage)).b();
        this.a.writeAndFlush((Object)byArray);
        ij_2.d(OutputMessage.a()).update(byArray.length);
    }

    public ChannelHandlerContext c() {
        return this.a;
    }

    public InetAddress d() {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)this.a.channel().remoteAddress();
        return inetSocketAddress.getAddress();
    }
}


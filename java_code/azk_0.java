/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.ssl.SslHandshakeCompletionEvent
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.ssl.SslHandshakeCompletionEvent;

/*
 * Renamed from aZK
 */
class azk_0
extends agm_2 {
    private final String b;
    private final int c;

    azk_0(String string, int n) {
        super(() -> new ceA(azu_0.j()), new ceB());
        this.b = string;
        this.c = n;
    }

    @Override
    protected void a(ChannelHandlerContext channelHandlerContext, SslHandshakeCompletionEvent sslHandshakeCompletionEvent) {
        super.a(channelHandlerContext, sslHandshakeCompletionEvent);
        if (sslHandshakeCompletionEvent.isSuccess()) {
            return;
        }
        azj_0.a.error((Object)"SSL connection problem", sslHandshakeCompletionEvent.cause());
        azj_0.a(this.b, this.c, false);
    }
}


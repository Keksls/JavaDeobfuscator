/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.ssl.SslHandler
 *  io.netty.handler.ssl.SslHandshakeCompletionEvent
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.ssl.SslHandshakeCompletionEvent;
import java.util.Optional;

/*
 * Renamed from aGm
 */
public class agm_2
extends SimpleChannelInboundHandler<adt_1> {
    private final abr_1<? extends aaw_2> b;
    private final aht_1 c;
    protected aaw_2 a;

    public agm_2(abr_1<? extends aaw_2> abr_12, aht_1 aht_12) {
        this.b = abr_12;
        this.c = aht_12;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        ChannelPipeline channelPipeline = channelHandlerContext.pipeline();
        Optional<SslHandler> optional = Optional.ofNullable((SslHandler)channelPipeline.get(SslHandler.class));
        if (optional.isEmpty()) {
            this.a(channelHandlerContext);
        }
        channelHandlerContext.fireChannelActive();
    }

    public void a(ChannelHandlerContext channelHandlerContext, adt_1 adt_12) {
        if (adt_12.l() == null) {
            adt_12.a(this.a);
        }
        add_2.b().a(adt_12);
        channelHandlerContext.fireChannelRead((Object)adt_12);
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.a();
        channelHandlerContext.fireChannelInactive();
    }

    public final void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
        if (object instanceof SslHandshakeCompletionEvent) {
            this.a(channelHandlerContext, (SslHandshakeCompletionEvent)object);
        }
        channelHandlerContext.fireUserEventTriggered(object);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, SslHandshakeCompletionEvent sslHandshakeCompletionEvent) {
        if (!sslHandshakeCompletionEvent.isSuccess()) {
            return;
        }
        this.a(channelHandlerContext);
    }

    private void a(ChannelHandlerContext channelHandlerContext) {
        this.a = this.b.createNew();
        this.a.a(new afq_1(channelHandlerContext));
        this.a.d();
        this.c.a(this.a);
    }

    private void a() {
        if (this.a == null) {
            return;
        }
        this.a.f();
        this.c.b(this.a);
    }

    public String toString() {
        return "ClientMessageHandler{m_entityFactory=" + this.b + ", m_eventsHandler=" + this.c + ", m_entity=" + (this.a != null) + "}";
    }

    public /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (adt_1)object);
    }
}


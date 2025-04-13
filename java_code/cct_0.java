/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  javax.inject.Inject
 */
import com.google.common.base.Preconditions;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;

/*
 * Renamed from cCT
 */
final class cct_0
extends SimpleChannelInboundHandler<String> {
    private final StringBuffer a = new StringBuffer();

    @Inject
    cct_0() {
        super(true);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, String string) {
        this.a.append(string);
        this.a(channelHandlerContext);
    }

    private void a(ChannelHandlerContext channelHandlerContext) {
        String string = this.a.toString();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int k = 0; k < string.length(); ++k) {
            char c2 = string.charAt(k);
            if (c2 == '{') {
                atomicInteger.incrementAndGet();
                continue;
            }
            if (c2 != '}' || atomicInteger.decrementAndGet() != 0) continue;
            this.a.delete(0, k + 1);
            String string2 = string.substring(0, k + 1).trim();
            channelHandlerContext.fireChannelRead((Object)string2);
            this.a(channelHandlerContext);
            return;
        }
        Preconditions.checkState((atomicInteger.get() >= 0 ? 1 : 0) != 0, (Object)"Parsing error : more closing bracket than opening bracket");
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (String)object);
    }
}


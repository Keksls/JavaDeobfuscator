/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jo
extends GeneratedMessageV3
implements jr {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    List<jg_0> h;
    public static final int c = 3;
    List<jc_0> i;
    private byte j = (byte)-1;
    private static final jo k = new jo();
    @Deprecated
    public static final Parser<jo> d = new jp();

    jo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jo() {
        this.g = 0;
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.h = new ArrayList<jg_0>();
                            n |= 2;
                        }
                        this.h.add((jg_0)codedInputStream.readMessage(jg_0.k, extensionRegistryLite));
                        continue block12;
                    }
                    case 26: 
                }
                if ((n & 4) != 4) {
                    this.i = new ArrayList<jc_0>();
                    n |= 4;
                }
                this.i.add((jc_0)codedInputStream.readMessage(jc_0.g, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if ((n & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return iw_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.d.ensureFieldAccessorsInitialized(jo.class, jq.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public List<jg_0> d() {
        return this.h;
    }

    @Override
    public List<? extends jj_0> e() {
        return this.h;
    }

    @Override
    public int f() {
        return this.h.size();
    }

    @Override
    public jg_0 a(int n) {
        return this.h.get(n);
    }

    @Override
    public jj_0 b(int n) {
        return this.h.get(n);
    }

    @Override
    public List<jc_0> g() {
        return this.i;
    }

    @Override
    public List<? extends jf_0> h() {
        return this.i;
    }

    @Override
    public int i() {
        return this.i.size();
    }

    @Override
    public jc_0 c(int n) {
        return this.i.get(n);
    }

    @Override
    public jf_0 d(int n) {
        return this.i.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        for (n = 0; n < this.f(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt32(1, this.g);
        }
        for (n = 0; n < this.h.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.h.get(n));
        }
        for (n = 0; n < this.i.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.i.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.f & 1) == 1) {
            n2 += CodedOutputStream.computeInt32Size((int)1, (int)this.g);
        }
        for (n = 0; n < this.h.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.h.get(n)));
        }
        for (n = 0; n < this.i.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.i.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jo)) {
            return super.equals(object);
        }
        jo jo2 = (jo)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jo2.b();
        if (this.b()) {
            bl = bl && this.c() == jo2.c();
        }
        bl = bl && this.d().equals(jo2.d());
        bl = bl && this.g().equals(jo2.g());
        bl = bl && this.unknownFields.equals((Object)jo2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jo.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jo a(ByteBuffer byteBuffer) {
        return (jo)d.parseFrom(byteBuffer);
    }

    public static jo a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jo a(ByteString byteString) {
        return (jo)d.parseFrom(byteString);
    }

    public static jo a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static jo a(byte[] byArray) {
        return (jo)d.parseFrom(byArray);
    }

    public static jo a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static jo a(InputStream inputStream) {
        return (jo)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static jo a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jo b(InputStream inputStream) {
        return (jo)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static jo b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jo a(CodedInputStream codedInputStream) {
        return (jo)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static jo a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jo)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jq j() {
        return jo.k();
    }

    public static jq k() {
        return k.l();
    }

    public static jq a(jo jo2) {
        return k.l().a(jo2);
    }

    public jq l() {
        return this == k ? new jq() : new jq().a(this);
    }

    protected jq a(GeneratedMessageV3.BuilderParent builderParent) {
        jq jq2 = new jq(builderParent);
        return jq2;
    }

    public static jo m() {
        return k;
    }

    public static Parser<jo> n() {
        return d;
    }

    public Parser<jo> getParserForType() {
        return d;
    }

    public jo o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jo jo2) {
        return jo2.unknownFields;
    }
}


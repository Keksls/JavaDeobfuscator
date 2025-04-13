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

public final class ne
extends GeneratedMessageV3
implements nh {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    mu f;
    public static final int b = 2;
    List<na> g;
    private byte h = (byte)-1;
    private static final ne i = new ne();
    @Deprecated
    public static final Parser<ne> c = new nf();

    ne(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ne() {
        this.g = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ne(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 10: {
                        mw mw2 = null;
                        if ((this.e & 1) == 1) {
                            mw2 = this.f.j();
                        }
                        this.f = (mu)codedInputStream.readMessage(mu.d, extensionRegistryLite);
                        if (mw2 != null) {
                            mw2.a(this.f);
                            this.f = mw2.k();
                        }
                        this.e |= 1;
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.g = new ArrayList<na>();
                    n |= 2;
                }
                this.g.add((na)codedInputStream.readMessage(na.g, extensionRegistryLite));
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
                this.g = Collections.unmodifiableList(this.g);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return mY.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mY.b.ensureFieldAccessorsInitialized(ne.class, ng.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public mu c() {
        return this.f == null ? mu.k() : this.f;
    }

    @Override
    public mx_0 d() {
        return this.f == null ? mu.k() : this.f;
    }

    @Override
    public List<na> e() {
        return this.g;
    }

    @Override
    public List<? extends nd> f() {
        return this.g;
    }

    @Override
    public int g() {
        return this.g.size();
    }

    @Override
    public na a(int n) {
        return this.g.get(n);
    }

    @Override
    public nd b(int n) {
        return this.g.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.c().isInitialized()) {
            this.h = 0;
            return false;
        }
        for (int k = 0; k < this.g(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        for (int k = 0; k < this.g.size(); ++k) {
            codedOutputStream.writeMessage(2, (MessageLite)this.g.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        for (int k = 0; k < this.g.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.g.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ne)) {
            return super.equals(object);
        }
        ne ne2 = (ne)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ne2.b();
        if (this.b()) {
            bl = bl && this.c().equals(ne2.c());
        }
        bl = bl && this.e().equals(ne2.e());
        bl = bl && this.unknownFields.equals((Object)ne2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ne.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.g() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ne a(ByteBuffer byteBuffer) {
        return (ne)c.parseFrom(byteBuffer);
    }

    public static ne a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ne a(ByteString byteString) {
        return (ne)c.parseFrom(byteString);
    }

    public static ne a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ne a(byte[] byArray) {
        return (ne)c.parseFrom(byArray);
    }

    public static ne a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ne a(InputStream inputStream) {
        return (ne)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ne a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ne b(InputStream inputStream) {
        return (ne)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ne b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ne a(CodedInputStream codedInputStream) {
        return (ne)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ne a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ne)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ng h() {
        return ne.i();
    }

    public static ng i() {
        return i.j();
    }

    public static ng a(ne ne2) {
        return i.j().a(ne2);
    }

    public ng j() {
        return this == i ? new ng() : new ng().a(this);
    }

    protected ng a(GeneratedMessageV3.BuilderParent builderParent) {
        ng ng2 = new ng(builderParent);
        return ng2;
    }

    public static ne k() {
        return i;
    }

    public static Parser<ne> l() {
        return c;
    }

    public Parser<ne> getParserForType() {
        return c;
    }

    public ne m() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ne ne2) {
        return ne2.unknownFields;
    }
}


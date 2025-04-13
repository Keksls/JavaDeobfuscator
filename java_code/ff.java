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

public final class ff
extends GeneratedMessageV3
implements fi {
    private static final long d = 0L;
    public static final int a = 1;
    List<eY> e;
    public static final int b = 2;
    List<eY> f;
    private byte g = (byte)-1;
    private static final ff h = new ff();
    @Deprecated
    public static final Parser<ff> c = new fg();

    ff(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ff() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ff(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if ((n & 1) != 1) {
                            this.e = new ArrayList<eY>();
                            n |= 1;
                        }
                        this.e.add((eY)codedInputStream.readMessage(eY.j, extensionRegistryLite));
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.f = new ArrayList<eY>();
                    n |= 2;
                }
                this.f.add((eY)codedInputStream.readMessage(eY.j, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((n & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return eT.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.f.ensureFieldAccessorsInitialized(ff.class, fh.class);
    }

    @Override
    public List<eY> b() {
        return this.e;
    }

    @Override
    public List<? extends fb> c() {
        return this.e;
    }

    @Override
    public int d() {
        return this.e.size();
    }

    @Override
    public eY a(int n) {
        return this.e.get(n);
    }

    @Override
    public fb b(int n) {
        return this.e.get(n);
    }

    @Override
    public List<eY> e() {
        return this.f;
    }

    @Override
    public List<? extends fb> f() {
        return this.f;
    }

    @Override
    public int g() {
        return this.f.size();
    }

    @Override
    public eY c(int n) {
        return this.f.get(n);
    }

    @Override
    public fb d(int n) {
        return this.f.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.g = 0;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.g = 0;
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.e.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.e.get(n));
        }
        for (n = 0; n < this.f.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f.get(n));
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
        for (n = 0; n < this.e.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.e.get(n)));
        }
        for (n = 0; n < this.f.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.f.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ff)) {
            return super.equals(object);
        }
        ff ff2 = (ff)object;
        boolean bl = true;
        bl = bl && this.b().equals(ff2.b());
        bl = bl && this.e().equals(ff2.e());
        bl = bl && this.unknownFields.equals((Object)ff2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ff.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.g() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ff a(ByteBuffer byteBuffer) {
        return (ff)c.parseFrom(byteBuffer);
    }

    public static ff a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ff a(ByteString byteString) {
        return (ff)c.parseFrom(byteString);
    }

    public static ff a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ff a(byte[] byArray) {
        return (ff)c.parseFrom(byArray);
    }

    public static ff a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ff a(InputStream inputStream) {
        return (ff)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ff a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff b(InputStream inputStream) {
        return (ff)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ff b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff a(CodedInputStream codedInputStream) {
        return (ff)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ff a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fh h() {
        return ff.i();
    }

    public static fh i() {
        return h.j();
    }

    public static fh a(ff ff2) {
        return h.j().a(ff2);
    }

    public fh j() {
        return this == h ? new fh() : new fh().a(this);
    }

    protected fh a(GeneratedMessageV3.BuilderParent builderParent) {
        fh fh2 = new fh(builderParent);
        return fh2;
    }

    public static ff k() {
        return h;
    }

    public static Parser<ff> l() {
        return c;
    }

    public Parser<ff> getParserForType() {
        return c;
    }

    public ff m() {
        return h;
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

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ff ff2) {
        return ff2.unknownFields;
    }
}


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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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

public final class jv
extends GeneratedMessageV3
implements jy {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    List<iy_0> g;
    private byte h = (byte)-1;
    private static final jv i = new jv();
    @Deprecated
    public static final Parser<jv> c = new jw();

    jv(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jv() {
        this.f = 0L;
        this.g = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.g = new ArrayList<iy_0>();
                    n |= 2;
                }
                this.g.add((iy_0)codedInputStream.readMessage(iy_0.e, extensionRegistryLite));
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
        return iw_0.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.p.ensureFieldAccessorsInitialized(jv.class, jx.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public List<iy_0> d() {
        return this.g;
    }

    @Override
    public List<? extends jb_0> e() {
        return this.g;
    }

    @Override
    public int f() {
        return this.g.size();
    }

    @Override
    public iy_0 a(int n) {
        return this.g.get(n);
    }

    @Override
    public jb_0 b(int n) {
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
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
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
        if (!(object instanceof jv)) {
            return super.equals(object);
        }
        jv jv2 = (jv)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jv2.b();
        if (this.b()) {
            bl = bl && this.c() == jv2.c();
        }
        bl = bl && this.d().equals(jv2.d());
        bl = bl && this.unknownFields.equals((Object)jv2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jv.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jv a(ByteBuffer byteBuffer) {
        return (jv)c.parseFrom(byteBuffer);
    }

    public static jv a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jv a(ByteString byteString) {
        return (jv)c.parseFrom(byteString);
    }

    public static jv a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static jv a(byte[] byArray) {
        return (jv)c.parseFrom(byArray);
    }

    public static jv a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static jv a(InputStream inputStream) {
        return (jv)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static jv a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jv b(InputStream inputStream) {
        return (jv)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static jv b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jv a(CodedInputStream codedInputStream) {
        return (jv)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static jv a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jv)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jx g() {
        return jv.h();
    }

    public static jx h() {
        return i.i();
    }

    public static jx a(jv jv2) {
        return i.i().a(jv2);
    }

    public jx i() {
        return this == i ? new jx() : new jx().a(this);
    }

    protected jx a(GeneratedMessageV3.BuilderParent builderParent) {
        jx jx2 = new jx(builderParent);
        return jx2;
    }

    public static jv j() {
        return i;
    }

    public static Parser<jv> k() {
        return c;
    }

    public Parser<jv> getParserForType() {
        return c;
    }

    public jv l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jv jv2) {
        return jv2.unknownFields;
    }
}


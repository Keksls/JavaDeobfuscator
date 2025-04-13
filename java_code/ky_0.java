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

/*
 * Renamed from ky
 */
public final class ky_0
extends GeneratedMessageV3
implements kB {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    List<ki> f;
    public static final int b = 2;
    km_0 g;
    private byte h = (byte)-1;
    private static final ky_0 i = new ky_0();
    @Deprecated
    public static final Parser<ky_0> c = new kz_0();

    ky_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ky_0() {
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ky_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.f = new ArrayList<ki>();
                            bl |= true;
                        }
                        this.f.add((ki)codedInputStream.readMessage(ki.e, extensionRegistryLite));
                        continue block11;
                    }
                    case 18: 
                }
                ko_0 ko_02 = null;
                if ((this.e & 1) == 1) {
                    ko_02 = this.g.j();
                }
                this.g = (km_0)codedInputStream.readMessage(km_0.c, extensionRegistryLite);
                if (ko_02 != null) {
                    ko_02.a(this.g);
                    this.g = ko_02.k();
                }
                this.e |= 1;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kg.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.b.ensureFieldAccessorsInitialized(ky_0.class, kA.class);
    }

    @Override
    public List<ki> b() {
        return this.f;
    }

    @Override
    public List<? extends kl> c() {
        return this.f;
    }

    @Override
    public int d() {
        return this.f.size();
    }

    @Override
    public ki a(int n) {
        return this.f.get(n);
    }

    @Override
    public kl b(int n) {
        return this.f.get(n);
    }

    @Override
    public boolean e() {
        return (this.e & 1) == 1;
    }

    @Override
    public km_0 f() {
        return this.g == null ? km_0.k() : this.g;
    }

    @Override
    public kx_0 g() {
        return this.g == null ? km_0.k() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.e()) {
            this.h = 0;
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.h = 0;
            return false;
        }
        if (!this.f().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.f.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.f.get(k));
        }
        if ((this.e & 1) == 1) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.f.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.f.get(k)));
        }
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ky_0)) {
            return super.equals(object);
        }
        ky_0 ky_02 = (ky_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(ky_02.b());
        boolean bl2 = bl = bl && this.e() == ky_02.e();
        if (this.e()) {
            bl = bl && this.f().equals(ky_02.f());
        }
        bl = bl && this.unknownFields.equals((Object)ky_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ky_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ky_0 a(ByteBuffer byteBuffer) {
        return (ky_0)c.parseFrom(byteBuffer);
    }

    public static ky_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ky_0 a(ByteString byteString) {
        return (ky_0)c.parseFrom(byteString);
    }

    public static ky_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ky_0 a(byte[] byArray) {
        return (ky_0)c.parseFrom(byArray);
    }

    public static ky_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ky_0 a(InputStream inputStream) {
        return (ky_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ky_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ky_0 b(InputStream inputStream) {
        return (ky_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ky_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ky_0 a(CodedInputStream codedInputStream) {
        return (ky_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ky_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ky_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kA h() {
        return ky_0.i();
    }

    public static kA i() {
        return i.j();
    }

    public static kA a(ky_0 ky_02) {
        return i.j().a(ky_02);
    }

    public kA j() {
        return this == i ? new kA() : new kA().a(this);
    }

    protected kA a(GeneratedMessageV3.BuilderParent builderParent) {
        kA kA2 = new kA(builderParent);
        return kA2;
    }

    public static ky_0 k() {
        return i;
    }

    public static Parser<ky_0> l() {
        return c;
    }

    public Parser<ky_0> getParserForType() {
        return c;
    }

    public ky_0 m() {
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

    static /* synthetic */ UnknownFieldSet b(ky_0 ky_02) {
        return ky_02.unknownFields;
    }
}


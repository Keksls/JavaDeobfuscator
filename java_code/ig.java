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

public final class ig
extends GeneratedMessageV3
implements in {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    List<ij> f;
    public static final int b = 53;
    int g;
    private byte h = (byte)-1;
    private static final ig i = new ig();
    @Deprecated
    public static final Parser<ig> c = new ih();

    ig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ig() {
        this.f = Collections.emptyList();
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.f = new ArrayList<ij>();
                            bl |= true;
                        }
                        this.f.add((ij)codedInputStream.readMessage(ij.c, extensionRegistryLite));
                        continue block11;
                    }
                    case 424: 
                }
                this.e |= 1;
                this.g = codedInputStream.readInt32();
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
        return hR.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.b.ensureFieldAccessorsInitialized(ig.class, ii.class);
    }

    @Override
    public List<ij> b() {
        return this.f;
    }

    @Override
    public List<? extends im> c() {
        return this.f;
    }

    @Override
    public int d() {
        return this.f.size();
    }

    @Override
    public ij a(int n) {
        return this.f.get(n);
    }

    @Override
    public im b(int n) {
        return this.f.get(n);
    }

    @Override
    public boolean e() {
        return (this.e & 1) == 1;
    }

    @Override
    public int f() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
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
            codedOutputStream.writeInt32(53, this.g);
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
            n += CodedOutputStream.computeInt32Size((int)53, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ig)) {
            return super.equals(object);
        }
        ig ig2 = (ig)object;
        boolean bl = true;
        bl = bl && this.b().equals(ig2.b());
        boolean bl2 = bl = bl && this.e() == ig2.e();
        if (this.e()) {
            bl = bl && this.f() == ig2.f();
        }
        bl = bl && this.unknownFields.equals((Object)ig2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ig.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 53;
            n = 53 * n + this.f();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ig a(ByteBuffer byteBuffer) {
        return (ig)c.parseFrom(byteBuffer);
    }

    public static ig a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ig a(ByteString byteString) {
        return (ig)c.parseFrom(byteString);
    }

    public static ig a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ig a(byte[] byArray) {
        return (ig)c.parseFrom(byArray);
    }

    public static ig a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ig a(InputStream inputStream) {
        return (ig)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ig a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ig b(InputStream inputStream) {
        return (ig)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ig b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ig a(CodedInputStream codedInputStream) {
        return (ig)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ig a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ig)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ii g() {
        return ig.h();
    }

    public static ii h() {
        return i.i();
    }

    public static ii a(ig ig2) {
        return i.i().a(ig2);
    }

    public ii i() {
        return this == i ? new ii() : new ii().a(this);
    }

    protected ii a(GeneratedMessageV3.BuilderParent builderParent) {
        ii ii2 = new ii(builderParent);
        return ii2;
    }

    public static ig j() {
        return i;
    }

    public static Parser<ig> k() {
        return c;
    }

    public Parser<ig> getParserForType() {
        return c;
    }

    public ig l() {
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

    static /* synthetic */ UnknownFieldSet b(ig ig2) {
        return ig2.unknownFields;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class Bs
extends GeneratedMessageV3.Builder<Bs>
implements Bt {
    private int a;
    private long b;
    private Object c = "";
    private Object d = "";
    private long e;

    public static final Descriptors.Descriptor a() {
        return AO.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.j.ensureFieldAccessorsInitialized(Bq.class, Bs.class);
    }

    Bs() {
        this.u();
    }

    Bs(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (Bq.r()) {
            // empty if block
        }
    }

    public Bs l() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.i;
    }

    public Bq m() {
        return Bq.o();
    }

    public Bq n() {
        Bq bq = this.o();
        if (!bq.isInitialized()) {
            throw Bs.newUninitializedMessageException((Message)bq);
        }
        return bq;
    }

    public Bq o() {
        Bq bq = new Bq(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bq.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bq.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        bq.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        bq.k = this.e;
        bq.g = n2;
        this.onBuilt();
        return bq;
    }

    public Bs p() {
        return (Bs)super.clone();
    }

    public Bs a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bs)super.setField(fieldDescriptor, object);
    }

    public Bs a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Bs)super.clearField(fieldDescriptor);
    }

    public Bs a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Bs)super.clearOneof(oneofDescriptor);
    }

    public Bs a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Bs)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Bs b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bs)super.addRepeatedField(fieldDescriptor, object);
    }

    public Bs a(Message message) {
        if (message instanceof Bq) {
            return this.a((Bq)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Bs a(Bq bq) {
        if (bq == Bq.o()) {
            return this;
        }
        if (bq.b()) {
            this.a(bq.c());
        }
        if (bq.d()) {
            this.a |= 2;
            this.c = bq.i;
            this.onChanged();
        }
        if (bq.g()) {
            this.a |= 4;
            this.d = bq.j;
            this.onChanged();
        }
        if (bq.j()) {
            this.b(bq.k());
        }
        this.b(Bq.b(bq));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return this.d();
    }

    public Bs a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Bq bq = null;
        try {
            bq = (Bq)Bq.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bq = (Bq)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bq != null) {
                this.a(bq);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public Bs a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public Bs q() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public Bs a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public Bs r() {
        this.a &= 0xFFFFFFFD;
        this.c = Bq.o().e();
        this.onChanged();
        return this;
    }

    public Bs a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public Bs b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public Bs s() {
        this.a &= 0xFFFFFFFB;
        this.d = Bq.o().h();
        this.onChanged();
        return this;
    }

    public Bs b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public long k() {
        return this.e;
    }

    public Bs b(long l) {
        this.a |= 8;
        this.e = l;
        this.onChanged();
        return this;
    }

    public Bs t() {
        this.a &= 0xFFFFFFF7;
        this.e = 0L;
        this.onChanged();
        return this;
    }

    public final Bs a(UnknownFieldSet unknownFieldSet) {
        return (Bs)super.setUnknownFields(unknownFieldSet);
    }

    public final Bs b(UnknownFieldSet unknownFieldSet) {
        return (Bs)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}


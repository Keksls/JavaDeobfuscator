/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from aS
 */
public final class as_2
extends GeneratedMessageV3.Builder<as_2>
implements at_2 {
    private long a;
    private bo_1 b = null;
    private SingleFieldBuilderV3<bo_1, bq_1, br_1> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.p.ensureFieldAccessorsInitialized(aq_2.class, as_2.class);
    }

    as_2() {
        this.n();
    }

    as_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (aq_2.l()) {
            // empty if block
        }
    }

    public as_2 f() {
        super.clear();
        this.a = 0L;
        if (this.c == null) {
            this.b = null;
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.o;
    }

    public aq_2 g() {
        return aq_2.i();
    }

    public aq_2 h() {
        aq_2 aq_22 = this.i();
        if (!aq_22.isInitialized()) {
            throw as_2.newUninitializedMessageException((Message)aq_22);
        }
        return aq_22;
    }

    public aq_2 i() {
        aq_2 aq_22 = new aq_2(this);
        aq_22.d = this.a;
        aq_22.e = this.c == null ? this.b : (bo_1)this.c.build();
        this.onBuilt();
        return aq_22;
    }

    public as_2 j() {
        return (as_2)super.clone();
    }

    public as_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (as_2)super.setField(fieldDescriptor, object);
    }

    public as_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (as_2)super.clearField(fieldDescriptor);
    }

    public as_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (as_2)super.clearOneof(oneofDescriptor);
    }

    public as_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (as_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public as_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (as_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public as_2 a(Message message) {
        if (message instanceof aq_2) {
            return this.a((aq_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public as_2 a(aq_2 aq_22) {
        if (aq_22 == aq_2.i()) {
            return this;
        }
        if (aq_22.b() != 0L) {
            this.a(aq_22.b());
        }
        if (aq_22.c()) {
            this.b(aq_22.d());
        }
        this.b(aq_2.b(aq_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public as_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        aq_2 aq_22 = null;
        try {
            aq_22 = (aq_2)aq_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aq_22 = (aq_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aq_22 != null) {
                this.a(aq_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public as_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public as_2 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public bo_1 d() {
        if (this.c == null) {
            return this.b == null ? bo_1.g() : this.b;
        }
        return (bo_1)this.c.getMessage();
    }

    public as_2 a(bo_1 bo_12) {
        if (this.c == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.b = bo_12;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bo_12);
        }
        return this;
    }

    public as_2 a(bq_1 bq_12) {
        if (this.c == null) {
            this.b = bq_12.f();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bq_12.f());
        }
        return this;
    }

    public as_2 b(bo_1 bo_12) {
        if (this.c == null) {
            this.b = this.b != null ? bo_1.a(this.b).a(bo_12).g() : bo_12;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)bo_12);
        }
        return this;
    }

    public as_2 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public bq_1 m() {
        this.onChanged();
        return (bq_1)this.o().getBuilder();
    }

    @Override
    public br_1 e() {
        if (this.c != null) {
            return (br_1)this.c.getMessageOrBuilder();
        }
        return this.b == null ? bo_1.g() : this.b;
    }

    private SingleFieldBuilderV3<bo_1, bq_1, br_1> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final as_2 a(UnknownFieldSet unknownFieldSet) {
        return (as_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final as_2 b(UnknownFieldSet unknownFieldSet) {
        return (as_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}


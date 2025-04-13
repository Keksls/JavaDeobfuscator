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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ov
 */
public final class ov_2
extends GeneratedMessageV3.Builder<ov_2>
implements ow_2 {
    private int a;
    private List<oq_1> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<oq_1, os_1, ox_2> c;

    public static final Descriptors.Descriptor a() {
        return oo_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.f.ensureFieldAccessorsInitialized(ot_1.class, ov_2.class);
    }

    ov_2() {
        this.m();
    }

    ov_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (ot_1.k()) {
            this.o();
        }
    }

    public ov_2 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return oo_1.e;
    }

    public ot_1 f() {
        return ot_1.h();
    }

    public ot_1 g() {
        ot_1 ot_12 = this.h();
        if (!ot_12.isInitialized()) {
            throw ov_2.newUninitializedMessageException((Message)ot_12);
        }
        return ot_12;
    }

    public ot_1 h() {
        ot_1 ot_12 = new ot_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            ot_12.d = this.b;
        } else {
            ot_12.d = this.c.build();
        }
        this.onBuilt();
        return ot_12;
    }

    public ov_2 i() {
        return (ov_2)super.clone();
    }

    public ov_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ov_2)super.setField(fieldDescriptor, object);
    }

    public ov_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ov_2)super.clearField(fieldDescriptor);
    }

    public ov_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ov_2)super.clearOneof(oneofDescriptor);
    }

    public ov_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ov_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ov_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ov_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ov_2 a(Message message) {
        if (message instanceof ot_1) {
            return this.a((ot_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ov_2 a(ot_1 ot_12) {
        if (ot_12 == ot_1.h()) {
            return this;
        }
        if (this.c == null) {
            if (!ot_12.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = ot_12.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(ot_12.d);
                }
                this.onChanged();
            }
        } else if (!ot_12.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = ot_12.d;
                this.a &= 0xFFFFFFFE;
                this.c = ot_1.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(ot_12.d);
            }
        }
        this.b(ot_1.b(ot_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ov_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ot_1 ot_12 = null;
        try {
            ot_12 = (ot_1)ot_1.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ot_12 = (ot_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ot_12 != null) {
                this.a(ot_12);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<oq_1>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<oq_1> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public oq_1 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (oq_1)this.c.getMessage(n);
    }

    public ov_2 a(int n, oq_1 oq_12) {
        if (this.c == null) {
            if (oq_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, oq_12);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)oq_12);
        }
        return this;
    }

    public ov_2 a(int n, os_1 os_12) {
        if (this.c == null) {
            this.n();
            this.b.set(n, os_12.D());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)os_12.D());
        }
        return this;
    }

    public ov_2 a(oq_1 oq_12) {
        if (this.c == null) {
            if (oq_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(oq_12);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)oq_12);
        }
        return this;
    }

    public ov_2 b(int n, oq_1 oq_12) {
        if (this.c == null) {
            if (oq_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, oq_12);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)oq_12);
        }
        return this;
    }

    public ov_2 a(os_1 os_12) {
        if (this.c == null) {
            this.n();
            this.b.add(os_12.D());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)os_12.D());
        }
        return this;
    }

    public ov_2 b(int n, os_1 os_12) {
        if (this.c == null) {
            this.n();
            this.b.add(n, os_12.D());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)os_12.D());
        }
        return this;
    }

    public ov_2 a(Iterable<? extends oq_1> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ov_2 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ov_2 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public os_1 d(int n) {
        return (os_1)this.o().getBuilder(n);
    }

    @Override
    public ox_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ox_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ox_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public os_1 k() {
        return (os_1)this.o().addBuilder((AbstractMessage)oq_1.E());
    }

    public os_1 e(int n) {
        return (os_1)this.o().addBuilder(n, (AbstractMessage)oq_1.E());
    }

    public List<os_1> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<oq_1, os_1, ox_2> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ov_2 a(UnknownFieldSet unknownFieldSet) {
        return (ov_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ov_2 b(UnknownFieldSet unknownFieldSet) {
        return (ov_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}


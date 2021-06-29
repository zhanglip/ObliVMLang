package com.oblivm.backend.generated.equalJoin;
import java.util.Arrays;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.security.SecureRandom;
import com.oblivm.backend.oram.SecureArray;
import com.oblivm.backend.oram.CircuitOram;
import com.oblivm.backend.flexsc.Mode;
import com.oblivm.backend.flexsc.Party;
import com.oblivm.backend.flexsc.CompEnv;
import com.oblivm.backend.circuits.arithmetic.IntegerLib;
import com.oblivm.backend.circuits.arithmetic.FloatLib;
import com.oblivm.backend.util.Utils;
import com.oblivm.backend.gc.regular.GCEva;
import com.oblivm.backend.gc.regular.GCGen;
import com.oblivm.backend.gc.GCSignal;
import com.oblivm.backend.flexsc.IWritable;
import com.oblivm.backend.lang.inter.*;
import com.oblivm.backend.flexsc.Comparator;
public class NoClass<t__T> implements IWritable<NoClass<t__T>, t__T>, ISecureRunnable<t__T> {

	public CompEnv<t__T> env;
	public IntegerLib<t__T> intLib;
	public FloatLib<t__T> floatLib;
	public NoClass<t__T> noclass = this;

	public NoClass(CompEnv<t__T> env) throws Exception {
		this.env = env;
		this.intLib = new IntegerLib<t__T>(env);
		this.floatLib = new FloatLib<t__T>(env, 24, 8);
	}

	public int numBits() {
		return 0;
	}

	public t__T[] getBits() throws Exception {
		t__T[] ret = env.newTArray(this.numBits());
		t__T[] tmp_b;
		t__T tmp;
		int now = 0;
		return ret;
	}

	public NoClass<t__T> newObj(t__T[] data) throws Exception {
		if(data == null) {
			data = env.newTArray(this.numBits());
			for(int i=0; i<this.numBits(); ++i) { data[i] = intLib.SIGNAL_ZERO; }
		}
		if(data.length != this.numBits()) return null;
		NoClass<t__T> ret = new NoClass<t__T>(env);
		t__T[] tmp;
		int now = 0;
		return ret;
	}

	public NoClass<t__T> fake() throws Exception {
		NoClass<t__T> ret = new NoClass<t__T>(env);
		return ret;
	}

	public NoClass<t__T> muxFake(t__T __isDummy) throws Exception {
		NoClass<t__T> ret = new NoClass<t__T>(env);
		return ret;
	}

	public t__T applyFilter(t__T[] lTuple, t__T[] rTuple) throws Exception {
		t__T ret = env.inputOfAlice(false);
		t__T[] _t_state = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T _t_state_new = env.inputOfAlice(false);
		int _t_count = 0;
		boolean __tmp0 = false;
		ret = env.inputOfAlice(__tmp0);
		t__T[] __tmp1 = Arrays.copyOfRange(lTuple, 0, 32);
		t__T[] __tmp2 = Arrays.copyOfRange(rTuple, 0, 32);
		t__T f_tmp_1 = intLib.eq(__tmp1, __tmp2);
		t__T __tmp3 = f_tmp_1;
		boolean __tmp4 = true;
		t__T f_tmp_4 = env.inputOfAlice(__tmp4);
		t__T __tmp5 = intLib.mux(ret, f_tmp_4,__tmp3);
		ret = __tmp5;
		return ret;

	}
	public t__T[] main(int l, int r, SecureArray<t__T> lhs, SecureArray<t__T> rhs) throws Exception {
		t__T[] lTupleCount = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] rTupleCount = env.inputOfAlice(Utils.fromInt(0, 32));
		SecureArray<t__T> dst = new SecureArray<t__T>(env, (l)*(r), 32);
		for(int _j_2 = 0; _j_2 < (l)*(r); ++_j_2) {
			dst.write(intLib.toSignals(_j_2), env.inputOfAlice(Utils.fromInt(0, 32)));
		}
		t__T[] dstIdx = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] srcTuple = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] t2 = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T filter = env.inputOfAlice(false);
		t__T[] i = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] j = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] dstTuple = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] _t_state = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] _t_state_new = env.inputOfAlice(Utils.fromInt(0, 4));
		int _t_count = 0;
		lTupleCount = env.inputOfAlice(Utils.fromInt(l, 32));
		rTupleCount = env.inputOfAlice(Utils.fromInt(r, 32));
		int __tmp6 = 0;
		dstIdx = env.inputOfAlice(Utils.fromInt(__tmp6, 32));
		int __tmp7 = 0;
		srcTuple = env.inputOfAlice(Utils.fromInt(__tmp7, 32));
		int __tmp8 = 0;
		t2 = env.inputOfAlice(Utils.fromInt(__tmp8, 32));
		boolean __tmp9 = false;
		filter = env.inputOfAlice(__tmp9);
		int __tmp10 = 0;
		i = env.inputOfAlice(Utils.fromInt(__tmp10, 32));
		int __tmp11 = 0;
		int __tmp12 = 1;
		int f_tmp_12 = __tmp11 + __tmp12;
		int __tmp13 = f_tmp_12;
		int f_tmp_13 = __tmp13 + l;
		int __tmp14 = f_tmp_13;
		int f_tmp_14 = l * r;
		int __tmp15 = f_tmp_14;
		int f_tmp_15 = __tmp14 + __tmp15;
		int __tmp16 = f_tmp_15;
		int f_tmp_16 = __tmp16 + l;
		int __tmp17 = f_tmp_16;
		_t_count = __tmp17;
		int __tmp18 = 0;
		_t_state = env.inputOfAlice(Utils.fromInt(__tmp18, 32));
		int __tmp19 = 0;
		boolean f_tmp_19 = _t_count >= __tmp19;
		boolean __tmp20 = f_tmp_19;
		while(__tmp20) {
			int __tmp21 = 0;
			t__T[] f_tmp_22 = env.inputOfAlice(Utils.fromInt(__tmp21, 32));
			t__T f_tmp_21 = intLib.eq(_t_state, f_tmp_22);
			t__T __tmp22 = f_tmp_21;
			t__T f_tmp_23 = intLib.not(intLib.geq(i, lTupleCount));
			t__T __tmp24 = f_tmp_23;
			t__T[] __tmp25 = env.inputOfAlice(Utils.fromInt(1, 4));
			t__T[] __tmp26 = env.inputOfAlice(Utils.fromInt(-1, 4));
			t__T[] __tmp23 = intLib.mux(__tmp26, __tmp25,__tmp24);
			t__T[] __tmp27 = intLib.mux(_t_state_new, __tmp23,__tmp22);
			_t_state_new = __tmp27;
			t__T f_tmp_28 = intLib.not(__tmp22);
			t__T __tmp28 = f_tmp_28;
			int __tmp29 = 1;
			t__T[] f_tmp_31 = env.inputOfAlice(Utils.fromInt(__tmp29, 32));
			t__T f_tmp_30 = intLib.eq(_t_state, f_tmp_31);
			t__T __tmp30 = f_tmp_30;
			t__T f_tmp_32 = intLib.and(__tmp28,__tmp30);
			t__T __tmp31 = f_tmp_32;
			t__T[] f_tmp_33 = lhs.read(i);
			t__T[] __tmp32 = f_tmp_33;
			t__T[] __tmp33 = intLib.mux(srcTuple, __tmp32,__tmp31);
			srcTuple = __tmp33;
			int __tmp34 = 0;
			t__T[] f_tmp_37 = env.inputOfAlice(Utils.fromInt(__tmp34, 32));
			t__T[] __tmp35 = intLib.mux(j, f_tmp_37,__tmp31);
			j = __tmp35;
			t__T f_tmp_38 = intLib.not(intLib.geq(j, rTupleCount));
			t__T __tmp37 = f_tmp_38;
			t__T[] __tmp38 = env.inputOfAlice(Utils.fromInt(4, 4));
			t__T[] __tmp39 = env.inputOfAlice(Utils.fromInt(11, 4));
			t__T[] __tmp36 = intLib.mux(__tmp39, __tmp38,__tmp37);
			t__T[] __tmp40 = intLib.mux(_t_state_new, __tmp36,__tmp31);
			_t_state_new = __tmp40;
			t__T f_tmp_43 = intLib.not(__tmp30);
			t__T __tmp41 = f_tmp_43;
			t__T f_tmp_44 = intLib.and(__tmp28,__tmp41);
			t__T __tmp42 = f_tmp_44;
			int __tmp43 = 4;
			t__T[] f_tmp_47 = env.inputOfAlice(Utils.fromInt(__tmp43, 32));
			t__T f_tmp_46 = intLib.eq(_t_state, f_tmp_47);
			t__T __tmp44 = f_tmp_46;
			t__T f_tmp_48 = intLib.and(__tmp42,__tmp44);
			t__T __tmp45 = f_tmp_48;
			t__T[] f_tmp_49 = rhs.read(j);
			t__T[] __tmp46 = f_tmp_49;
			t__T[] __tmp47 = intLib.mux(t2, __tmp46,__tmp45);
			t2 = __tmp47;
			t__T __tmp48 = noclass.applyFilter(srcTuple, t2);
			t__T __tmp49 = intLib.mux(filter, __tmp48,__tmp45);
			filter = __tmp49;
			t__T __tmp51 = filter;
			t__T f_tmp_52 = intLib.and(__tmp45,__tmp51);
			t__T __tmp52 = f_tmp_52;
			t__T[] __tmp53 = Arrays.copyOfRange(srcTuple, 0, 32);
			t__T[] __tmp54 = Arrays.copyOfRange(dstTuple, 0, 32);
			t__T[] __tmp55 = intLib.mux(__tmp54, __tmp53,__tmp52);
			System.arraycopy(__tmp55, 0, dstTuple, 0, (32)-(0));
			t__T[] f_tmp_54 = dst.read(dstIdx);
			t__T[] __tmp56 = f_tmp_54;
			t__T[] __tmp57 = intLib.mux(__tmp56, dstTuple,__tmp52);
			dst.write(dstIdx,__tmp57);
			int __tmp58 = 1;
			t__T[] f_tmp_58 = env.inputOfAlice(Utils.fromInt(__tmp58, 32));
			t__T[] f_tmp_57 = intLib.add(dstIdx,f_tmp_58);
			t__T[] __tmp59 = f_tmp_57;
			t__T[] __tmp60 = intLib.mux(dstIdx, __tmp59,__tmp52);
			dstIdx = __tmp60;
			int __tmp61 = 1;
			t__T[] f_tmp_62 = env.inputOfAlice(Utils.fromInt(__tmp61, 32));
			t__T[] f_tmp_61 = intLib.add(j,f_tmp_62);
			t__T[] __tmp62 = f_tmp_61;
			t__T[] __tmp63 = intLib.mux(j, __tmp62,__tmp45);
			j = __tmp63;
			t__T f_tmp_64 = intLib.not(intLib.geq(j, rTupleCount));
			t__T __tmp65 = f_tmp_64;
			t__T[] __tmp66 = env.inputOfAlice(Utils.fromInt(4, 4));
			t__T[] __tmp67 = env.inputOfAlice(Utils.fromInt(11, 4));
			t__T[] __tmp64 = intLib.mux(__tmp67, __tmp66,__tmp65);
			t__T[] __tmp68 = intLib.mux(_t_state_new, __tmp64,__tmp45);
			_t_state_new = __tmp68;
			t__T f_tmp_69 = intLib.not(__tmp44);
			t__T __tmp69 = f_tmp_69;
			t__T f_tmp_70 = intLib.and(__tmp42,__tmp69);
			t__T __tmp70 = f_tmp_70;
			int __tmp71 = 11;
			t__T[] f_tmp_73 = env.inputOfAlice(Utils.fromInt(__tmp71, 32));
			t__T f_tmp_72 = intLib.eq(_t_state, f_tmp_73);
			t__T __tmp72 = f_tmp_72;
			t__T f_tmp_74 = intLib.and(__tmp70,__tmp72);
			t__T __tmp73 = f_tmp_74;
			int __tmp74 = 1;
			t__T[] f_tmp_77 = env.inputOfAlice(Utils.fromInt(__tmp74, 32));
			t__T[] f_tmp_76 = intLib.add(i,f_tmp_77);
			t__T[] __tmp75 = f_tmp_76;
			t__T[] __tmp76 = intLib.mux(i, __tmp75,__tmp73);
			i = __tmp76;
			t__T f_tmp_79 = intLib.not(intLib.geq(i, lTupleCount));
			t__T __tmp78 = f_tmp_79;
			t__T[] __tmp79 = env.inputOfAlice(Utils.fromInt(1, 4));
			t__T[] __tmp80 = env.inputOfAlice(Utils.fromInt(-1, 4));
			t__T[] __tmp77 = intLib.mux(__tmp80, __tmp79,__tmp78);
			t__T[] __tmp81 = intLib.mux(_t_state_new, __tmp77,__tmp73);
			_t_state_new = __tmp81;
			int __tmp82 = 1;
			int f_tmp_85 = _t_count - __tmp82;
			int __tmp83 = f_tmp_85;
			_t_count = __tmp83;
			t__T[] __tmp84 = intLib.enforceBits(_t_state_new, 32);
			_t_state = __tmp84;
			__tmp19 = 0;
			boolean f_tmp_87 = _t_count >= __tmp19;
			__tmp20 = f_tmp_87;
		}
		int __tmp85 = 0;
		i = env.inputOfAlice(Utils.fromInt(__tmp85, 32));
		int __tmp86 = 0;
		int __tmp87 = 1;
		int f_tmp_91 = __tmp86 + __tmp87;
		int __tmp88 = f_tmp_91;
		int f_tmp_92 = l * r;
		int __tmp89 = f_tmp_92;
		int f_tmp_93 = __tmp88 + __tmp89;
		int __tmp90 = f_tmp_93;
		_t_count = __tmp90;
		int __tmp91 = 0;
		_t_state = env.inputOfAlice(Utils.fromInt(__tmp91, 32));
		int __tmp92 = 0;
		boolean f_tmp_96 = _t_count >= __tmp92;
		boolean __tmp93 = f_tmp_96;
		while(__tmp93) {
			int __tmp94 = 0;
			t__T[] f_tmp_99 = env.inputOfAlice(Utils.fromInt(__tmp94, 32));
			t__T f_tmp_98 = intLib.eq(_t_state, f_tmp_99);
			t__T __tmp95 = f_tmp_98;
			t__T f_tmp_100 = intLib.not(intLib.geq(i, dstIdx));
			t__T __tmp97 = f_tmp_100;
			t__T[] __tmp98 = env.inputOfAlice(Utils.fromInt(1, 4));
			t__T[] __tmp99 = env.inputOfAlice(Utils.fromInt(-1, 4));
			t__T[] __tmp96 = intLib.mux(__tmp99, __tmp98,__tmp97);
			t__T[] __tmp100 = intLib.mux(_t_state_new, __tmp96,__tmp95);
			_t_state_new = __tmp100;
			t__T f_tmp_105 = intLib.not(__tmp95);
			t__T __tmp101 = f_tmp_105;
			int __tmp102 = 1;
			t__T[] f_tmp_108 = env.inputOfAlice(Utils.fromInt(__tmp102, 32));
			t__T f_tmp_107 = intLib.eq(_t_state, f_tmp_108);
			t__T __tmp103 = f_tmp_107;
			t__T f_tmp_109 = intLib.and(__tmp101,__tmp103);
			t__T __tmp104 = f_tmp_109;
			if (env.mode == Mode.VERIFY) {
				long old_and_gates = env.numOfAnds;
				t__T[] f_tmp_110 = dst.read(i);
				t__T[] __tmp105 = f_tmp_110;
				if ((Boolean)__tmp104) {
					if (env.party == Party.Alice) {
						System.out.println("at (39, 9) "+Utils.toInt(env.outputToAlice(__tmp105)));
					} else {
						Utils.toInt(env.outputToAlice(__tmp105));
					}
				}
				env.numOfAnds = old_and_gates;
			}
			int __tmp106 = 1;
			t__T[] f_tmp_113 = env.inputOfAlice(Utils.fromInt(__tmp106, 32));
			t__T[] f_tmp_112 = intLib.add(i,f_tmp_113);
			t__T[] __tmp107 = f_tmp_112;
			t__T[] __tmp108 = intLib.mux(i, __tmp107,__tmp104);
			i = __tmp108;
			t__T f_tmp_115 = intLib.not(intLib.geq(i, dstIdx));
			t__T __tmp110 = f_tmp_115;
			t__T[] __tmp111 = env.inputOfAlice(Utils.fromInt(1, 4));
			t__T[] __tmp112 = env.inputOfAlice(Utils.fromInt(-1, 4));
			t__T[] __tmp109 = intLib.mux(__tmp112, __tmp111,__tmp110);
			t__T[] __tmp113 = intLib.mux(_t_state_new, __tmp109,__tmp104);
			_t_state_new = __tmp113;
			int __tmp114 = 1;
			int f_tmp_121 = _t_count - __tmp114;
			int __tmp115 = f_tmp_121;
			_t_count = __tmp115;
			t__T[] __tmp116 = intLib.enforceBits(_t_state_new, 32);
			_t_state = __tmp116;
			__tmp92 = 0;
			boolean f_tmp_123 = _t_count >= __tmp92;
			__tmp93 = f_tmp_123;
		}
		return dstIdx;

	}
	public t__T[] main (int __n, int __m, t__T[] x, t__T[] y) throws Exception {
		int l = __n / (32);
		int r = __m / (32);
		if ( (l) * (32) != __n ) {
			throw new RuntimeException("input size doesn't match");
		}
		if ( (r) * (32) != __m ) {
			throw new RuntimeException("input size doesn't match");
		}
		return main(l, r, com.oblivm.backend.lang.inter.Util.intToSecArray(env, x, 32, l), com.oblivm.backend.lang.inter.Util.intToSecArray(env, y, 32, r));
	}
}

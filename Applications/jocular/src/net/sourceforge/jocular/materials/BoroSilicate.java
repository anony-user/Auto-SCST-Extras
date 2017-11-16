/*******************************************************************************
 * Copyright (c) 2014, Kenneth MacCallum
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 *     Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *     Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package net.sourceforge.jocular.materials;

import java.awt.Color;

import net.sourceforge.jocular.math.LookupTable;


public class BoroSilicate extends SimpleOpticalMaterial {
	private static final double[] boroTX = {1.6e-7, 1.8e-7, 2.0E-7, 2.2705E-007, 2.43868E-007, 2.56482E-007, 2.60687E-007, 2.64891E-007, 2.69096E-007, 2.73301E-007, 2.77505E-007, 2.8171E-007, 2.8171E-007, 2.85915E-007, 2.90119E-007, 2.94324E-007, 2.98528E-007, 2.98528E-007, 3.02733E-007, 3.06938E-007, 3.11142E-007, 3.15347E-007, 3.15347E-007, 3.19552E-007, 3.23756E-007, 0.000000328, 3.3637E-007, 0.000000349, 3.74212E-007, 4.03644E-007, 4.541E-007, 0.000000576, 0.000000698, 8.24107E-007, 9.50245E-007, 1.07638E-006, 1.20252E-006, 1.32866E-006, 1.4548E-006, 1.57673E-006, 1.70287E-006, 0.000001829, 1.95515E-006, 2.07288E-006, 2.19481E-006, 2.31675E-006, 2.43027E-006, 0.000002548, 2.65732E-006, 2.69937E-006, 2.70778E-006, 0.000002712, 0.000002712, 2.72039E-006, 2.73721E-006, 2.76664E-006, 2.80028E-006, 2.8171E-006, 2.83392E-006, 2.85494E-006, 2.88017E-006, 2.9054E-006, 0.000002939, 2.97687E-006, 3.01892E-006, 3.06517E-006, 3.11983E-006, 3.19552E-006, 0.000003288, 3.32165E-006, 3.34268E-006, 3.3595E-006, 3.37211E-006, 3.38472E-006, 3.40154E-006, 3.41416E-006, 3.42677E-006, 3.43938E-006, 0.000003452, 3.46041E-006, 0.000003473, 3.48563E-006, 0.000003494, 3.50666E-006, 3.51927E-006, 3.52768E-006, 3.5445E-006, 3.55711E-006, 3.57393E-006, 3.60336E-006, 3.65382E-006, 3.67905E-006, 3.70427E-006, 3.7253E-006, 3.74632E-006, 3.78837E-006, 3.84723E-006, 3.88928E-006, 3.93553E-006, 0.000004007, 4.06587E-006, 4.12053E-006, 4.20042E-006, 4.26349E-006, 4.29713E-006, 0.000004335, 4.39383E-006, 4.4569E-006, 4.51577E-006, 4.57043E-006, 4.62929E-006, 4.68816E-006, 4.76384E-006, 4.88157E-006, 4.94043E-006, 5.1e-6};
	//private static final double[] boroTY = {0, 0, 0, 0, 0.0311615, 0.0594901, 0.0878187, 0.116147, 0.144476, 0.201133, 0.229462, 0.286119, 0.286119, 0.342776, 0.399433, 0.427762, 0.484419, 0.484419, 0.541076, 0.597734, 0.626062, 0.68272, 0.68272, 0.739377, 0.767705, 0.824363, 0.852691, 0.88102, 0.908404, 0.92068, 0.929178, 0.926346, 0.928234, 0.929178, 0.929178, 0.929178, 0.930123, 0.930123, 0.931067, 0.932956, 0.9339, 0.9339, 0.932011, 0.92729, 0.918791, 0.919736, 0.910293, 0.90085, 0.888574, 0.862134, 0.833805, 0.777148, 0.777148, 0.654391, 0.441926, 0.422096, 0.449481, 0.476865, 0.505194, 0.533522, 0.560907, 0.589235, 0.616619, 0.643059, 0.670444, 0.69594, 0.721435, 0.744098, 0.732767, 0.706327, 0.677998, 0.649669, 0.622285, 0.593957, 0.565628, 0.537299, 0.508971, 0.480642, 0.453258, 0.424929, 0.396601, 0.368272, 0.339943, 0.311615, 0.283286, 0.254958, 0.227573, 0.199245, 0.170916, 0.143532, 0.155807, 0.183192, 0.21152, 0.238905, 0.267233, 0.293673, 0.274788, 0.247403, 0.221907, 0.20491, 0.229462, 0.254958, 0.261568, 0.237016, 0.209632, 0.183192, 0.157696, 0.133144, 0.108593, 0.082153, 0.0576015, 0.0321058, 0.0122757, 0.00566572, 0, 0};
	private static final double[] boroTY = {0, 0, 0, 0, 0.033808547, 0.064510181, 0.095213102, 0.125905412, 0.156588302, 0.217958934, 0.24861677, 0.309952525, 0.309952525, 0.371268651, 0.432565411, 0.463170167, 0.524433796, 0.524433796, 0.585678751, 0.646906395, 0.677460116, 0.738656473, 0.738656473, 0.799834122, 0.830353662, 0.891501315, 0.921867308, 0.952085837, 0.980879215, 0.993219582, 1.001129702, 0.996409455, 0.997547232, 0.99793282, 0.997424151, 0.996944462, 0.997483643, 0.996994405, 0.997500509, 0.99901774, 0.999485308, 0.998921621, 0.996316628, 0.990706374, 0.981025673, 0.981409781, 0.970735644, 0.960028676, 0.946341085, 0.917950778, 0.887742559, 0.827399356, 0.827399356, 0.69666926, 0.470429301, 0.449239112, 0.478285281, 0.507370751, 0.53745513, 0.567516616, 0.596550525, 0.626577007, 0.655553427, 0.683492884, 0.712400456, 0.739261227, 0.766056, 0.789701986, 0.777159374, 0.748932649, 0.718782964, 0.688663592, 0.659573735, 0.629488652, 0.599388905, 0.569314572, 0.539246885, 0.509183709, 0.480127122, 0.450089663, 0.420043509, 0.390001862, 0.359977894, 0.329947783, 0.29992254, 0.269913096, 0.240889829, 0.210883109, 0.180875183, 0.15185973, 0.164779502, 0.193701453, 0.223607991, 0.252513814, 0.282405774, 0.31023672, 0.290140085, 0.261129546, 0.234123507, 0.216052336, 0.241809397, 0.268541164, 0.275295437, 0.249303399, 0.220427381, 0.192553954, 0.165657728, 0.139776768, 0.113933655, 0.086144142, 0.060362252, 0.033623313, 0.012845308, 0.005920831, 0, 0};
	private static final double[] boroNiX = {3.620500E-07, 3.768240E-07, 3.908590E-07, 4.063710E-07, 4.226220E-07, 4.403510E-07, 4.610340E-07, 4.846720E-07, 5.112650E-07, 5.378580E-07, 5.644510E-07, 5.932590E-07, 6.242840E-07, 6.567870E-07, 6.915050E-07, 7.254850E-07, 7.602030E-07, 7.941830E-07, 8.289010E-07, 8.643580E-07, 8.990770E-07, 9.345340E-07, 9.692520E-07, 1.003970E-06, 1.012100E-06};
	private static final double[] boroNiY = {1.488650, 1.486810, 1.484980, 1.483190, 1.481390, 1.479640, 1.478010, 1.476450, 1.475100, 1.473750, 1.472390, 1.471120, 1.470040, 1.469160, 1.468410, 1.467690, 1.466970, 1.466290, 1.465660, 1.465100, 1.464500, 1.463940, 1.463390, 1.462830, 1.462710};
	public BoroSilicate(){
		super(new LookupTable(boroNiX, boroNiY,200,true), new LookupTable(boroTX, boroTY,200,true), null);
		
	}
	
	@Override
	public Color getColour(){
		// Light Sky Blue
		return new Color(176,226,255);
	}
}


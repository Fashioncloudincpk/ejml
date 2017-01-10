/*
 * Copyright (c) 2009-2017, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.dense.row.linsol.lu;

import org.ejml.data.DMatrixRow_C64;
import org.ejml.dense.row.decompose.lu.LUDecompositionAlt_CR64;
import org.ejml.dense.row.linsol.GenericLinearSolverChecks_CR64;
import org.ejml.interfaces.linsol.LinearSolver;


/**
 * @author Peter Abeles
 */
public class TestLinearSolverLu_CR64 extends GenericLinearSolverChecks_CR64 {

    public TestLinearSolverLu_CR64() {
        shouldWorkRectangle = false;
        shouldFailSingular = false;
    }

    @Override
    protected LinearSolver<DMatrixRow_C64> createSolver(DMatrixRow_C64 A ) {
        LUDecompositionAlt_CR64 decomp = new LUDecompositionAlt_CR64();

        return new LinearSolverLu_CR64(decomp);
    }
}
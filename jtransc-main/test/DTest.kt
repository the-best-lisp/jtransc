import big.HelloWorldTest
import big.MiniHelloWorldTest
import com.jtransc.gen.d.DTarget
import org.junit.Test

/*
 * Copyright 2016 Carlos Ballesteros Velasco
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class DTest : Base() {
	//@Test fun testMiniHelloWorld() = testClass<MiniHelloWorldTest>(minimize = false, target = DTarget(), log = false)
	@Test fun testHelloWorld() = testClass<HelloWorldTest>(minimize = false, target = DTarget(), log = false)
}

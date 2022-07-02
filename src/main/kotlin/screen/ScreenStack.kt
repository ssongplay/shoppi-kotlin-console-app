package screen

// 프로젝트 전역에서 화면 이동 관리하는 싱글톤 객체

object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    fun pop() {
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }

}

sealed class Screen